package o000oo0;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;

/* loaded from: classes2.dex */
public final class o000OOo implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ MethodChannel.Result f31034OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ oo000o f31035OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ String f31036OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ o000000 f31037OooOoO0;

    public o000OOo(o000000 o000000Var, oo000o oo000oVar, String str, MethodChannel.Result result) {
        this.f31037OooOoO0 = o000000Var;
        this.f31035OooOo0O = oo000oVar;
        this.f31036OooOo0o = str;
        this.f31034OooOo = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (o000000.f31023OooOoOO) {
            oo000o oo000oVar = this.f31035OooOo0O;
            if (oo000oVar != null) {
                o000000.OooO00o(this.f31037OooOoO0, oo000oVar);
            }
            try {
                if (o0OoOo0.OooO00o(o000000.f31025OooOoo0)) {
                    Log.d("Sqflite", "delete database " + this.f31036OooOo0o);
                }
                SQLiteDatabase.deleteDatabase(new File(this.f31036OooOo0o));
            } catch (Exception e) {
                Log.e("Sqflite", "error " + e + " while closing database " + o000000.f31028Oooo000);
            }
        }
        this.f31034OooOo.success(null);
    }
}
