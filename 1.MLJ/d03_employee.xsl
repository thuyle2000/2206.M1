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
            </head>
            <body>
                <div>
                    <h2>Danh sach nhan vien</h2>
                    <hr />
                    
                    <xsl:apply-templates select="company" />
                    <xsl:apply-templates select="department" />
                </div>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="company">
        <p>
           Ten cong ty: <xsl:value-of select="com-name" /><br/>
           Dia chi: <xsl:value-of select="com-add" />  <br/>
           So dien thoai: <xsl:value-of select="com-tel" />  
        </p>
    </xsl:template>
    
    
    <xsl:template match="department">
        <p>
            Ten bo phan: <xsl:value-of select="dep-name" /><br/>
            Truong phong: <xsl:value-of select="manager" /><br/>
        </p>       
        <div>
            <h4>Danh sach nhan vien </h4>
            <p>
                <xsl:value-of select="employees" />
            </p>
        </div> 
    </xsl:template>
    

</xsl:stylesheet>
