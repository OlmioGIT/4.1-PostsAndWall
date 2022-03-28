package ru.netology

import ru.netology.data.Comments
import ru.netology.data.Post
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
        signerId = 1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned= true,
        markedAsAds= true,
        postponedId = 1

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
        friendsOnly = false,
        comments = Comments(1, true, true, true, true),
        signerId = 1,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned= false,
        markedAsAds= false,
        postponedId = 1
        )

    WallService.update(secondMaster)
    WallService.showLast()

}



