package bh.com.donix.pdf.services


import bh.com.donix.extensions.logInfo
import bh.com.donix.pdf.model.DonixPdf
import org.springframework.stereotype.Service
import java.io.FileOutputStream


@Service
class PdfService(
    private val donixPdf: DonixPdf
) {

    fun createPdf() {
        ("processing pdf creation request ..").logInfo()
//        donixPdf.createDocument(FileOutputStream("src/main/resources/DoNix.pdf"))
    }


}