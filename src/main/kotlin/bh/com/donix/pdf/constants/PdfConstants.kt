package bh.com.donix.pdf.constants

import com.itextpdf.text.BaseColor
import com.itextpdf.text.Document
import com.itextpdf.text.Font
import com.itextpdf.text.PageSize

class PdfConstants {
    companion object {
        /** DOCUMENTS **/
        val DEFAULT_A4_DOCUMENT = Document(PageSize.A4,36f,36f, 36f, 70f)

        /** FONTS **/
        val TABLE_HEADER_FONT = Font(Font.FontFamily.TIMES_ROMAN, 13F, Font.BOLD, BaseColor.BLACK)
        val PAGE_FOOTER_NUMBER_FONT = Font(Font.FontFamily.COURIER, 10f, Font.BOLD, BaseColor.BLACK)
        val PAGE_FOOTER_TEXT_FONT = Font(Font.FontFamily.COURIER,10f, Font.NORMAL, BaseColor.BLACK)

        /** COLORS **/
        val SMOKE_WHITE_COLOR = BaseColor(236, 236, 236)
    }
}