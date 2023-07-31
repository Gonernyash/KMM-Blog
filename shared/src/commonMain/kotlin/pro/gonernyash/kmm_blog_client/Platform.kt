package pro.gonernyash.kmm_blog_client

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform