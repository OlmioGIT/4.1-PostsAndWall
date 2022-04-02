package ru.netology

import ru.netology.data.*
import ru.netology.service.WallService


fun main () {

    val secondOrigin = Post(
        id = 2,
        authorId = 15,
        fromId = 142132,
        createdBy = 0,
        date = 1,
        text = "I dont wanna see fck stars",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
        comments = Comments(1, true, true, true, true),
        copyright = null,
        likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
        reposts = Reposts(id = 15, user_reposted = true),
        views = 77,
        postType = "",
        postSource = "",
        attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
        geo = null,
        signerId = 1,
        copyHistory = "",
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        donut = null,
        postponedId = 1,
    )

    WallService.add(secondOrigin)

    val secondMaster = Post(
        id = 2,
        authorId = 20,
        fromId = 142132,
        createdBy = 0,
        date = 12,
        text = "Stars is really beautiful",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
        comments = Comments(1, true, true, true, true),
        copyright = null,
        likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
        reposts = Reposts(id = 15, user_reposted = true),
        views = 77,
        postType = "",
        postSource = "",
        attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
        geo = null,
        signerId = 1,
        copyHistory = "",
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        donut = null,
        postponedId = 1,
        )

    val newComment = Comment(
        authorId = 20,
        PostId = 2,
        from_group = 0,
        message = "Ты не прав...",
        replyToUser = null,
        replyToComment= null,
        attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
        stickerId = null
        )


    WallService.update(secondMaster)
    WallService.showLast()

    WallService.createComment(newComment)




}



