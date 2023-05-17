//package com.example.expensemanagement.Database
//
//import android.content.ContentValues
//import android.content.Context
//import android.database.sqlite.SQLiteDatabase
//import android.database.sqlite.SQLiteOpenHelper
//import com.example.expensemanagement.Model.Infomodel
//
//class IncExpDatabase(context: Context?) : SQLiteOpenHelper(context, "budget.db", null, 1) {
//    override fun onCreate(db: SQLiteDatabase?) {
//
//        var sql =
//            "CREATE TABLE data(id INTEGER PRIMARY KEY AUTOINCREMENT,awt INTEGER,categry TEXT,note TEXT,isexpense INTEGER)"
//        db?.execSQL(sql)
//
//    }
//
//    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
//
//    }
//
//    fun insertdata(data: Infomodel) {
//
//        var db = writableDatabase
//        var value = ContentValues().apply {
//            data.apply {
//                put("")
//                put("")
//                put("")
//                put("")
//                put("")
//                put("")
//                put("")
//                put("")
//            }
//        }
//        db.insert("data", null, value)
//
//    }
//
//    fun retrivedata(): ArrayList<Infomodel> {
//        var list= ArrayList<Infomodel>()
//        var db = readableDatabase
//        var sql = "SELECT * FROM data where = id"
//        var cursor = db.rawQuery(sql, null)
//        cursor.moveToFirst()
//for (i in 0 ..  cursor.count-1){
//var id = cursor.getInt(0)
//
//
//
//
//
//    var data=Infomodel(id)
//list.add(data)
//cursor.moveToNext()
//
//
//}
//        return list
//
//    }
//
//    fun deletdata(id: Int) {
//  var db=writableDatabase
//db.delete("data","id=$id",null)
//    }
//
//   fun updatedata(infomodel: Infomodel){
//       var db=readableDatabase
//       var values=ContentValues().apply {
//
//           infomodel.apply {
//put("",)
//               put("",)
//               put("",)
//               put("",)
//               put("",)
//               put("",)
//               put("",)
//               put("",)
//               put("", )
//           }
//       }
//       db.update("data",values,"id=${infomodel.id}",null)
//
//   }
//}