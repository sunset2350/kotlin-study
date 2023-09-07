package accountManager.kotlin


object AccountManager {
    data class Account(val accountNumber: String, val balance: Long)

    var accountList = mutableListOf<Account>()
    var input = readLine()

    fun addAccount(accountNumber: String, balance: Long) {
        accountList = mutableListOf(Account(accountNumber, balance))
    }

    fun findByAccount() {
//        val findAccount = accountList.filter { it.accountNumber == accountNumber }
    }

    fun deposit() {
    }

    fun withdraw() {
    }

    fun run() {
        println("\n=== 계좌 관리 프로그램 ===")
        println("1. 계좌 추가")
        println("2. 계좌 목록 조회")
        println("3. 입금")
        println("4. 출금")
        println("5. 계좌이체")
        println("0. 종료")
        print("원하는 기능을 선택하세요: ")

        val value = input?.toInt()

        when (value) {
            1 -> "가나다"
            2 -> "aaaaa"

            0 -> {
                "프로그램이 종료 됩니다."
                return
            }
            else -> {
                println("잘못 입력")
            }
        }


    }

}