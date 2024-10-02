fun calculateFrames(minutes: Int, fps: Int): Int {
    val seconds = minutes * 60
    val frames = seconds * fps
    return frames
}
fun main() {
    val minutes = 2
    val fps = 60
    val totalFrames = calculateFrames(minutes, fps)
    println("Количество кадров за 2 минут при 60 FPS: $totalFrames")
}