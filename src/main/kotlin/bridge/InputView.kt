package bridge

import camp.nextstep.edu.missionutils.Console

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
class InputView {
    /**
     * 다리의 길이를 입력받는다.
     */
    fun readBridgeSize(): Int {
        var size:Int
        while (true) {
            try {
                println("다리 건너기 게임을 시작합니다.")
                println("다리의 길이를 입력해주세요.")
                val readSize = Console.readLine()
                size = readSize.toInt()
                return size
            } catch (e: IllegalArgumentException) {
                println("[ERROR]: 숫자만 입력해주세요.")
            }
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    fun readMoving(): String {
        println("이동할 칸을 선택해주세요. (위: U, 아래: D)")
        var step = Console.readLine()
        return step
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)")
        var regame = Console.readLine()
        return regame
    }
}
