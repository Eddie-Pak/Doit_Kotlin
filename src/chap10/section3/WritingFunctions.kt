package chap10.section3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!." // 문자열의 구성
    val path = "D:\\test\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)
    val writer = FileWriter(path, true) // 인자: 경로, append여부


//    File(path).printWriter().use { out -> out.println(outString) }
//    File(path).printWriter().use { it.println(outString) }

    File(path).bufferedWriter().use { it.write(outString) }

    file.writeText(outString)
    file.appendText("\nDo great work!") // 파일에 문자열을 추가

    // FileWriter 사용하기
//    try {
//        writer.write(outString)
//    } catch (e: Exception) {
//        // 오류 발생
//    } finally {
//        writer.close()
//    }
//    FileWriter(path, true).use { it.write(outString) }
}