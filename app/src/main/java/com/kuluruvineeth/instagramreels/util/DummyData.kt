package com.kuluruvineeth.instagramreels.util

import android.net.Uri

object DummyData {
    val reels = listOf<Reel>(
        Reel(
            id=1,
            video="lake.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/4.png",
            userName = "Kuluru Vineeth",
            isLiked = true,
            likesCount = 778,
            commentsCount = 156,
            comment = "wkwk...."
        ),
        Reel(
            id = 2,
            video = "food.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/7.png",
            userName = "Muhammad Ali",
            isLiked = true,
            likesCount = 5923,
            commentsCount = 11,
            comment = "Agririze is your dream"
        ),
        Reel(
            id = 3,
            video = "icecream.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/3.png",
            userName = "Christian Juned",
            isLiked = true,
            likesCount = 2314,
            comment = "Purpose of you is agririze",
            commentsCount = 200
        ),
        Reel(
            id = 4,
            video = "soap-bubbles.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/6.png",
            userName = "Cak Jhon",
            isLiked = true,
            likesCount = 786,
            comment = "Make it real your dream",
            commentsCount = 700
        ),
        Reel(
            id = 5,
            video = "castle.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/2.png",
            userName = "David Dulkader",
            isLiked = true,
            likesCount = 1890,
            comment = "you can do it",
            commentsCount = 232
        )
    )
}

data class Reel(
    val id:Int,
    private val video: String,
    val userImage: String,
    val userName: String,
    val isLiked: Boolean = false,
    val likesCount: Int,
    val comment: String,
    val commentsCount: Int
){
    fun getVideoUrl(): Uri{
        return Uri.parse("asset:///${video}")
    }
}