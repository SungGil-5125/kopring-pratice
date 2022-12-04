package com.project.kopring.domain.comment.util

import com.project.kopring.domain.comment.domain.Comment
import com.project.kopring.domain.comment.presentation.data.dto.CommentDto
import com.project.kopring.domain.comment.presentation.data.request.CommentRequest
import com.project.kopring.domain.post.domain.Post

interface CommentConverter {

    fun toDto(postId: Long, request: CommentRequest): CommentDto
    fun toEntity(dto: CommentDto, post: Post): Comment

}