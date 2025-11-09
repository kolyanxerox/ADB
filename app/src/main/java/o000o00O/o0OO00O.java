package o000o00o;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import o00O0Oo.OooO0O0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0OO00O implements OooO0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30876OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f30877OooOo0o;

    public /* synthetic */ o0OO00O(Context context, int i) {
        this.f30876OooOo0O = i;
        this.f30877OooOo0o = context;
    }

    @Override // o00O0Oo.OooO0O0
    public final Object invoke() {
        switch (this.f30876OooOo0O) {
            case 0:
                return DataStoreFile.dataStoreFile(this.f30877OooOo0o, "aqs/sessionConfigsDataStore.data");
            default:
                return DataStoreFile.dataStoreFile(this.f30877OooOo0o, "aqs/sessionDataStore.data");
        }
    }
}
