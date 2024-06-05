object DataHolder {
    var conteudoNome:String?=null
    var conteudoEmail:String?=null
    var conteudo1tela: String? = null
    var conteudo2tela: String? = null
    var conteudo3telaButton: String? = null
    var conteudo3telaIdade: String? = null
    var conteudo3telaAltura: String? = null
    var conteudo3telaPeso:String?=null
    var conteudoTmb:String?=null
    var inputkcal:Int=0

    val safeConteudo1tela: String
        get() = conteudo1tela ?: "Objetivo não informado"

    val safeConteudo3telaAltura: String
        get() = conteudo3telaAltura?.toString() ?: "Altura não informada"

    val safeConteudo3telaPeso: String
        get() = conteudo3telaPeso?.toString() ?: "Peso não informado"

    val safeConteudo3telaIdade: String
        get() = conteudo3telaIdade?.toString() ?: "Idade não informada"

    val safeConteudoEmail: String
        get() = conteudoEmail ?: "Email não informado"

    val safeConteudoNome: String
        get() = conteudoNome ?: ""

    val safeConteudo3telaButton: String
        get() = conteudo3telaButton ?: "Sexo não informado"

    val safeConteudo2telaButton: String
        get() = conteudo2tela ?: "Atividade não informado"




}