package com.ohgnarly.fileripper.exceptions

class FileRipperException : Exception {
    constructor(message: String) : super(message) {}

    constructor(cause: Throwable) : super(cause) {}

    constructor(message: String, cause: Throwable) : super(message, cause) {}
}
