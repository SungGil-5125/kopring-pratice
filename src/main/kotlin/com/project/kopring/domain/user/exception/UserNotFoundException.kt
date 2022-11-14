package com.project.kopring.domain.user.exception

import com.project.kopring.global.exception.ErrorCode

class UserNotFoundException(
        var errorCode: ErrorCode
): RuntimeException(errorCode.message)