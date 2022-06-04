<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
        <xsl:template match="/">
            <html>
                <body>
                    <h1>Moviles</h1>
                    <table>
                        <tr bgcolor="#00BFFF">
                            <th>Marca</th>
                            <th>Modelo</th>
                            <th>Dimensiones</th>
                            <th>Peso</th>
                            <th>Procesador</th>
                            <th>Ram</th>
                            <th>Sistema Operativo</th>
                            <th>Almacenamiento</th>
                        </tr>
                        <xsl:for-each select="moviles/movil">
                        <tr>
                            <xsl:choose>
                            <xsl:when test="ram &gt; 4">
                                <td bgcolor="#FF0000"> <xsl:value-of select="marca"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="modelo"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="dimensiones"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="peso"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="procesador"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="ram"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="sistema_op"/> </td>
                                <td bgcolor="#FF0000"> <xsl:value-of select="almacenamiento"/> </td>
                                </xsl:when>
                            <xsl:when test="ram &lt; 4">
                                <td bgcolor="#00FF00"> <xsl:value-of select="marca"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="modelo"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="dimensiones"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="peso"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="procesador"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="ram"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="sistema_op"/> </td>
                                <td bgcolor="#00FF00"> <xsl:value-of select="almacenamiento"/> </td>
                                </xsl:when>
                            <xsl:when test="ram=4">
                                <td bgcolor="#FFFF00"> <xsl:value-of select="marca"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="modelo"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="dimensiones"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="peso"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="procesador"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="ram"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="sistema_op"/> </td>
                                <td bgcolor="#FFFF00"> <xsl:value-of select="almacenamiento"/> </td>
                                </xsl:when>

                            </xsl:choose>
                            </tr> 
                        </xsl:for-each>
                    </table>
                </body>
            </html>
        </xsl:template>
    </xsl:stylesheet>

