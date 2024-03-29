package ru.byprogminer.modbot.api.message

import java.time.Duration

interface Audio: Attachment {

    val id: Long
    val title: String
    val duration: Duration
    val url: String
}
