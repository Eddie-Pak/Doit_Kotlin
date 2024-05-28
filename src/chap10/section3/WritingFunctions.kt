package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!." // 문자열의 구성
    val path = "D:\\test\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString) // 파일에 출력
    printWriter.close()
}