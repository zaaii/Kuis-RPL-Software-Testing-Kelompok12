import java.text.SimpleDateFormat

class Student() {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    private var Sid: Int = 0
    get() = field

    fun setSid(){
        this.Sid = Sid
    }

    // Nama bertipe String, Contoh : Joko Tarbiah
    private var Sname: String = ""
    get() = field

    fun setSname(){
        this.Sname = Sname
    }

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    private var Sbirth: String = ""
    get() = field

    fun setSbirth(){
        this.Sbirth = Sbirth
    }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun changeFormatDate(Sbirth: String): String {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy")
        val dateParse = dateFormat.parse(Sbirth)
        val dateFormatFinal = SimpleDateFormat("dd-MM-yyyy")
        return dateFormatFinal.format(dateParse)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    private var Sphone: String = ""
    fun setPhoneNumber(Sphone: String): String {
        this.Sphone = if (Sphone.length < 11 || Sphone.length > 12) {
            "Nomor tidak valid"
        } else {
            Sphone
        }

        if (Sphone.length < 11 || Sphone.length > 12) {
            return "Nomor Handphone Tidak Valid"
        }
        return Sphone
    }
    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */

    //val parent: Map<String, String> = mapOf("ayah" to "Stephen Sambura", "Ibu" to "Stephani Sambruang")
    //Ini nda tambahi pkai object
    private var orangTua: parent = parent("Stephen Sambura", "Stephani Sambruang")
    get() = field

    fun setOrangTua(){
        this.orangTua = orangTua
    }
    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    private var hobby: List<String> = listOf("Bersepeda", "Bernyanyi", "Makan")
    get() = field

    fun setHobby(){
        this.hobby = hobby
    }

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    fun formatNim(Sid: Int, Sname: String, Sbirth: String): String {
        val nim = "$Sid${Sname[0]}${Sbirth.substring(Sbirth.length - 4)}"
        return nim
    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
    fun getListStudent(): ArrayList<Student> {
        val listStudent = ArrayList<Student>()
        listStudent.add(Student())
        return listStudent
    }
}