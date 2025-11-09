package OoooOOO;

import Oooo.OooOo00;
import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.internal.ads.C1373a5;
import com.google.android.gms.internal.ads.C2294z4;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.n50;
import com.google.android.gms.internal.ads.o000000;
import com.google.android.gms.internal.ads.o00000OO;
import com.google.android.gms.internal.ads.o0000Ooo;
import com.google.android.gms.internal.ads.o000O;
import com.google.android.gms.internal.ads.o000O00;
import com.google.android.gms.internal.ads.v91;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0O0O0O implements OnFailureListener, o00000OO, o0000Ooo, bf0 {

    /* renamed from: OooOo0O */
    public long f14387OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f14388OooOo0o;

    public /* synthetic */ o0O0O0O(long j, Object obj) {
        this.f14387OooOo0O = j;
        this.f14388OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public void OooO(o000O00 o000o002) {
        ((v91) this.f14388OooOo0o).OooO(new com.google.android.gms.internal.ads.o00O(this, o000o002, o000o002));
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public void OooO00o(int i) throws EOFException, InterruptedIOException {
        ((o000000) this.f14388OooOo0o).OooO0oO(i, false);
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public void OooO0O0(int i) {
        ((o000000) this.f14388OooOo0o).OooO(i);
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public void OooO0OO() {
        ((v91) this.f14388OooOo0o).OooO0OO();
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public boolean OooO0o(byte[] bArr, int i, int i2, boolean z) {
        return ((o000000) this.f14388OooOo0o).OooO0o(bArr, 0, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public boolean OooO0o0(byte[] bArr, int i, int i2, boolean z) {
        return ((o000000) this.f14388OooOo0o).OooO0o0(bArr, 0, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public o000O OooO0oO(int i, int i2) {
        return ((v91) this.f14388OooOo0o).OooO0oO(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.q51
    public int OooOO0(byte[] bArr, int i, int i2) {
        return ((o000000) this.f14388OooOo0o).OooOO0(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public void OooOO0O(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        ((o000000) this.f14388OooOo0o).OooO0o0(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public void OooOO0o(byte[] bArr, int i, int i2) {
        ((o000000) this.f14388OooOo0o).OooO0o(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        ((AtomicLong) ((OooOo00) this.f14388OooOo0o).f13713OooOoO0).set(this.f14387OooOo0O);
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzj) ((n50) this.f14388OooOo0o).f13856OooO00o).zzN()) {
            return null;
        }
        C2294z4 c2294z4Oooo0o0 = C1373a5.Oooo0o0();
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5 c1373a5 = (C1373a5) c2294z4Oooo0o0.f25822OooOo0o;
        long j = this.f14387OooOo0O;
        C1373a5.Oooo00o(c1373a5, j);
        byte[] bArrOooO0Oo = ((C1373a5) c2294z4Oooo0o0.OooO0O0()).OooO0Oo();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        ze0.Oooo0O0(sQLiteDatabase, j, bArrOooO0Oo);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public long zzd() {
        return ((o000000) this.f14388OooOo0o).f21646OooOo - this.f14387OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public long zze() {
        return ((o000000) this.f14388OooOo0o).zze() - this.f14387OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public long zzf() {
        return ((o000000) this.f14388OooOo0o).f21650OooOoO0 - this.f14387OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public void zzj() {
        ((o000000) this.f14388OooOo0o).f21651OooOoOO = 0;
    }

    public o0O0O0O(o000000 o000000Var, long j) {
        this.f14388OooOo0o = o000000Var;
        af0.OoooO0(o000000Var.f21650OooOoO0 >= j);
        this.f14387OooOo0O = j;
    }

    public /* synthetic */ o0O0O0O(Object obj, long j) {
        this.f14388OooOo0o = obj;
        this.f14387OooOo0O = j;
    }

    public o0O0O0O(int i) {
        switch (i) {
            case 7:
                this.f14388OooOo0o = null;
                this.f14387OooOo0O = -1L;
                break;
            default:
                this.f14388OooOo0o = new ArrayList();
                break;
        }
    }

    public o0O0O0O(oo000o oo000oVar) {
        o000000O.OooO0oo(oo000oVar);
        this.f14388OooOo0o = oo000oVar;
    }
}
