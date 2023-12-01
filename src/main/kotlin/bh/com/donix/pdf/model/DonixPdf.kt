package bh.com.donix.pdf.model

import bh.com.donix.extensions.logInfo
import bh.com.donix.pdf.constants.PdfConstants
import bh.com.donix.pdf.constants.PdfConstants.Companion.DEFAULT_A4_DOCUMENT
import bh.com.donix.pdf.constants.PdfConstants.Companion.SMOKE_WHITE_COLOR
import bh.com.donix.pdf.constants.PdfConstants.Companion.TABLE_HEADER_FONT
import bh.com.donix.pdf.helper.PdfHelper
import com.itextpdf.text.*
import com.itextpdf.text.pdf.PdfPCell
import com.itextpdf.text.pdf.PdfPTable
import com.itextpdf.text.pdf.PdfPageEventHelper
import com.itextpdf.text.pdf.PdfWriter
import org.springframework.stereotype.Component
import java.io.FileInputStream
import java.io.OutputStream

@Component
class DonixPdf(
    private val pdfHelper: PdfHelper
) : PdfDocument() {

    //    fun createDocument(outStream: OutputStream) {
//        ("Creating DONIX Pdf Document ... ").logInfo()
//        super.createDocument(DEFAULT_A4_DOCUMENT, outStream)
//    }
//
//    override fun setPdfEvents(writer: PdfWriter) {
//        ("Setting pdf document [events]").logInfo()
//        writer.pageEvent = object : PdfPageEventHelper() {
//            override fun onEndPage(writer: PdfWriter?, document: Document?) {
//                setPdfPageFooter(writer!!)
//            }
//
//            override fun onOpenDocument(writer: PdfWriter?, document: Document?) {
//                ("Opening Pdf document").logInfo()
//                super.onOpenDocument(writer, document)
//            }
//
//            override fun onCloseDocument(writer: PdfWriter?, document: Document?) {
//                ("Closing Pdf document").logInfo()
//                super.onCloseDocument(writer, document)
//            }
//        }
//    }
//
//    override fun setPdfElements(writer: PdfWriter, doc: Document) {
//        ("Setting pdf document [elements]").logInfo()
//        pdfHelper.addBackgroundColor(writer, doc, SMOKE_WHITE_COLOR)
//
//        val image = Image.getInstance(FileInputStream("src/main/resources/logo.png").readAllBytes())
//        image.scaleToFit(40F, 40F)
//
//        image.borderWidth = 1F
//        image.borderColor = BaseColor.RED
//
//        val logo = pdfHelper.createTable(1, PdfPCell(image).apply {
//            setBorderColor(BaseColor.RED)
//            setBorderWidth(3F)
//        }).apply {
//            setWidthPercentage(100F)
//        }
////        PdfPTable(1).apply {
////            ad
////        }
//
//
////        pdfHelper.addTableCells(, )
//
//        pdfHelper.addElements(doc, mutableListOf(getStatTable(),image ))
//    }
//
//    override fun setPdfPageFooter(writer: PdfWriter) {
//        val pageNumber =
//            PdfPCell(Phrase("Page " + writer.pageNumber, PdfConstants.PAGE_FOOTER_NUMBER_FONT)).apply {
//                border = PdfPCell.NO_BORDER
//                horizontalAlignment = Element.ALIGN_RIGHT
//            }
//
//        val footerContent =
//            PdfPCell(Phrase("This is a sample footer.", PdfConstants.PAGE_FOOTER_TEXT_FONT)).apply {
//                border = PdfPCell.NO_BORDER
//                horizontalAlignment = Element.ALIGN_LEFT
//            }
//
//        PdfPTable(2).apply {
//            totalWidth = 530f
//            pdfHelper.addTableCells(this, mutableListOf(footerContent, pageNumber))
//        }.writeSelectedRows(0, -1, 30f, 50f, writer.directContent)
//    }
//
//    fun getStatTable(): PdfPTable {
//        val headers = mutableListOf(
//            PdfPCell(Phrase("Column 1", TABLE_HEADER_FONT)),
//            PdfPCell(Phrase("Column 2", TABLE_HEADER_FONT)),
//            PdfPCell(Phrase("Column 3", TABLE_HEADER_FONT)),
//        )
//
//        val row = mutableListOf(
//            PdfPCell(Phrase("1 col row", Font(Font.FontFamily.TIMES_ROMAN, 12F, Font.NORMAL, BaseColor(34, 34, 34)))),
//            PdfPCell(Phrase("2 col row",Font(Font.FontFamily.COURIER, 12F, Font.NORMAL, BaseColor(34, 34, 34)))),
//            PdfPCell(Phrase("3  col row", Font(Font.FontFamily.HELVETICA, 12F, Font.NORMAL, BaseColor(34, 34, 34)))),
//        )
//
//        return pdfHelper.createTable(3, mutableListOf(headers, row))
//    }
    override fun setPdfEvents(writer: PdfWriter) {
        TODO("Not yet implemented")
    }

    override fun setPdfElements(writer: PdfWriter, doc: Document) {
        TODO("Not yet implemented")
    }

    override fun setPdfPageFooter(writer: PdfWriter) {
        TODO("Not yet implemented")
    }

}