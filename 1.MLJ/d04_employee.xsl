<?xml version="1.0" encoding="UTF-8"?>
<!--
khai bao chuyen ho so XML (d03_employee_xsl.xml) thanh tai lieu web
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/employee-list">
        <html>
            <head>
                <title>employee</title>
                
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" />
                    
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
                
            </head>
            
            <body>
                <div class="container">
                    <h2>Danh sach nhan vien</h2>
                    <hr />
                    
                    <xsl:apply-templates select="company" />
                    <xsl:apply-templates select="department" />
                    
                    <div style="color: blue; font-weight:bold;font-size:1.1em;">
                        <p>
                            Tong so nhan vien: <xsl:number value="count(//employee)"/> 
                            <br/>
                            Tong quy luong: <xsl:number value="sum(//salary)"/> <br/>
                            So nhan vien co luong tren 10000:
                            <xsl:number value="count(//employee[salary &gt;=10000])" /> 
                        </p>
                    </div>                            
                </div>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="company">
        <p>
            Ten cong ty: <xsl:value-of select="com-name" />
            <br/>
            Dia chi: <xsl:value-of select="com-add" />  
            <br/>
            So dien thoai: <xsl:value-of select="com-tel" />  
        </p>
    </xsl:template>
    
    
    <xsl:template match="department">
        <p>
            Ten bo phan: <xsl:value-of select="dep-name" />
            <br/>
            Truong phong: <xsl:value-of select="manager" />
            <br/>
        </p>       
        <div>
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>Stt</th>
                        <th>ID</th>
                        <th>Ho ten</th>
                        <th>Ngay sinh</th>
                        <th>Luong cb</th>
                        <th>Chuc vu</th>
                    </tr>
                </thead>
                
                <tbody>
                    <xsl:for-each select="employees/employee">
                        <xsl:sort select="salary" data-type="number"  />
                        <tr>
                            <td><xsl:number value="position()" format="1" /> </td>
                            <td><xsl:value-of select="@id" /></td>
                            <td><xsl:value-of select="name" /></td>
                            <td><xsl:value-of select="dob" /></td>
                            <td style="text-align:right;"><xsl:value-of select="salary" /></td>
                            <td><xsl:value-of select="position" /></td>
                        </tr>
                    </xsl:for-each>
                    
                </tbody>
                
                <tfoot>
                    <tr>
                        <td colspan="4">Tong Luong</td>
                        <td> <xsl:number value="sum(.//salary)" /> </td>
                        <td>  </td>
                    </tr>
                </tfoot>
            </table>
        </div> 
    </xsl:template>
    

</xsl:stylesheet>