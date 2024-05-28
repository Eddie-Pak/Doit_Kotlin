package chap10.section3

fun main() {
    val path = "D;\\test\\Over the Rainbow.txt"

//    // 단순 변환
//    val file = File(path)
//    val inputStream: InputStream = file.inputStream()
//    val inputStreamReader = InputStreamReader(inputStream)
//    val sb = StringBuilder()
//    var line: String?
//    val br = BufferedReader(inputStreamReader)
//
//    try {
//        line = br.readLine()
//        while (line != null) {
//            sb.append(line, '\n')
//            line = br.readLine()
//        }
//        println(sb)
//    } catch (e: Exception) {
//
//    } finally {
//        br.close()
//    }

//    // 코드 단순화
//    val file = File(path)
//    val inputStream: InputStream = file.inputStream()
//    val text = inputStream.bufferedReader().use { it.readText() }
//    println(text)

//    // file 객체를 생략하고 BufferedReader로만 구성한 코드
//    val bufferedReader: BufferedReader = File(path).bufferedReader()
//    val inputString = bufferedReader.use { it.readText() }
//    println(inputString)

//    // 줄단위로 처리하면 use()대신 useLines()를 사용할수 있다. useLines()는 코틀린의 시퀀스를 이용하고 있으며 처리가 완료된 뒤 파일을 닫는다.
//    val bufferedReader = File(path).bufferedReader()
//    val lineList = mutableListOf<String>()
//    bufferedReader.useLines { lines -> lines.forEach { lineList.add(it) } }
//    lineList.forEach { println("> " + it) }

//    // 위코드에서 BufferedReader까지 생략하고 파일을 직접 사용한 코드
//    val lineList = mutableListOf<String>()
//    File(path).useLines { lines -> lines.forEach { lineList.add(it) } }
//    lineList.forEach { println("> " + it) }

//    // copyTo() 테스트
//    File(path).copyTo(File("D:\\test\\file2.txt"))
//
//    // 파일의 내용 출력하기
//    File(path).forEachLine { println(it) }
//
//    // 바이트 단위로 읽기 ( 쓰기는 writrBytes() )
//    val bytes = File(path).readBytes()
//    println(Arrays.toString(bytes))
//
//    // 줄 단위로 읽기
//    val lines = File(path).readLines()
//    lines.forEach { println(it) }
//
//    // 텍스트 단위로 읽기 ( 쓰기는 writeText() )
//    val text = File(path).readText()
//    println(text)
}