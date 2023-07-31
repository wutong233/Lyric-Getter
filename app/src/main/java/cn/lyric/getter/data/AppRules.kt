package cn.lyric.getter.data


class AppRules : ArrayList<AppRuleItem>()

data class AppRuleItem(
    val packName: String,
    val rules: List<Rule>
)

data class Rule(
    val apiVersion: Int,
    val endVersionCode: Long,
    val getLyricType: Int,
    val remarks: String,
    val startVersionCode: Long,
    val useApi: Boolean
)

fun Int.lyricType(): String {
    return when (this) {
        0 -> "魅族状态栏模式"
        1 -> "车载蓝牙歌词模式"
        2 -> "桌面歌词模式"
        3 -> "强制模式"
        else -> ""
    }
}