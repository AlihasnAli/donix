package bh.com.donix.extensions

import mu.KotlinLogging

fun String.logInfo() = toInfo(this)
fun String.logError() = toError(this)
fun String.logDebug() = toDebug(this)
fun String.logMainEvent() = toMainEvent(this)

private val log = KotlinLogging.logger {}

private fun toInfo(event: String) {
   log.info { event }
}

private fun toError(event: String) {
    log.error { event }
}

private fun toDebug(event: String) {
   log.debug { event }
}

private fun toMainEvent(event: String) {
    val border = "*".repeat((event.length + 4))
    toInfo(border)
    toInfo("* $event *")
    toInfo(border)
}

