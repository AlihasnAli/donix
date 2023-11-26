package bh.com.donix.pdf.helper


import bh.com.donix.logInfo
import bh.com.donix.pdf.constants.PdfConstants.Companion.PAGE_FOOTER_NUMBER_FONT
import bh.com.donix.pdf.constants.PdfConstants.Companion.PAGE_FOOTER_TEXT_FONT
import com.itextpdf.text.*
import com.itextpdf.text.pdf.*
import org.springframework.stereotype.Component


@Component
class PdfHelper {

    fun addBackgroundColor(writer: PdfWriter, doc: Document, backgroundColor: BaseColor) {
        ("adding background color to pdf doc ...").logInfo()
        with(doc) {
            writer.directContent.apply {
                setColorFill(backgroundColor)
                rectangle(0.0, 0.0, pageSize.width.toDouble(), pageSize.height.toDouble())
                fill()
            }
        }
    }

    fun addBackgroundImage(writer: PdfWriter, doc: Document, backgroundImagePath: String) {
        ("adding background image to pdf doc ...").logInfo()
        val backgroundImage = Image.getInstance(backgroundImagePath).apply {
            setAbsolutePosition(0F, 0F)
            scaleAbsolute(doc.pageSize)
        }
        writer.directContent.apply {
            addImage(backgroundImage)
        }
    }

    fun addElements(doc: Document, elements: MutableList<Element>) {
        ("adding elements to pdf document ...").logInfo()
        elements.forEach { element ->
            doc.add(element)
        }
    }


    fun addTableCells(table: PdfPTable, cells: MutableList<PdfPCell>) {
        cells.forEach { cell ->
            table.addCell(cell)
        }
    }

    fun addPageFooter(writer: PdfWriter) {
        val table = PdfPTable(2).apply {
            totalWidth = 530f
        }

        val pageNumber =
            PdfPCell(Phrase("Page " + writer.pageNumber, PAGE_FOOTER_NUMBER_FONT)).apply {
                border = PdfPCell.NO_BORDER
                horizontalAlignment = Element.ALIGN_RIGHT
            }

        val footerContent =
            PdfPCell(Phrase("This is a sample footer.", PAGE_FOOTER_TEXT_FONT)).apply {
                border = PdfPCell.NO_BORDER
                horizontalAlignment = Element.ALIGN_LEFT
            }

        table.apply {
            addTableCells(this, mutableListOf(footerContent, pageNumber))
        }.writeSelectedRows(0, -1, 30f, 50f, writer.directContent)
    }

    fun emptyBorderlessTableCell(): PdfPCell {
        return PdfPCell().apply {
            border = PdfPCell.NO_BORDER
        }
    }

//    fun addTableRows(table: PdfPTable, rows: MutableList<MutableList<String>>){
//        val img: Image = Image.getInstance("C:\\Workspace\\micro-services\\DONIX\\src\\main\\resources\\download.png")
//        img.scalePercent(50F)
//        val imageCell = PdfPCell(img)
//        table.addCell(imageCell)

//        log.info("creating table element [rows] ...")
//        rows.forEach { row ->
//            row.forEach { cellData ->
//                val cell = PdfPCell().apply {
//                    phrase = Phrase(cellData, Font())
//                }
//                cell.horizontalAlignment = 2
//                table.addCell(cell)
//            }
//        }


//    }



}