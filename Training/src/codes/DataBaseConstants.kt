package codes

class DataBaseConstants {
    object CONNECTION {
        const val DRIVER = "oracle.jdbc.driver.OracleDriver"
        //const val URL = "jdbc:oracle:thin:@10.184.17.27:1521/zeus"
        const val URL = "jdbc:oracle:thin:@192.200.9.24:1521/db24"
        //const val USERDB = "rmeneguetti"
        const val USERDB = "BD122017"
        //const val PASSDB = "elektro2018"
        const val PASSDB = "BD122017"
    }
    object CIRCUIT_BREAKER {
        const val SCHEMADATA_EKT = "elektro_data."
        const val SCHEMADATA_DB24 = "cea_data."
        const val TABLENAME = "znet_circuit_breaker"
        const val ID = "id"
        const val LABEL = "label"
        const val ONIS_VER = "onis_ver"
        const val COLOR = "color"
    }
}