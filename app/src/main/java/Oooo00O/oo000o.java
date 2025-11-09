package Oooo00O;

import Oooo00o.o000O000;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes2.dex */
public final class oo000o extends o000O000 {
    public static final Parcelable.Creator<oo000o> CREATOR = new OooOoo0.o000OOo(10);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13838OooOo0O;
    private final Account zab;
    private final int zac;

    @Nullable
    private final GoogleSignInAccount zad;

    public oo000o(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f13838OooOo0O = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f13838OooOo0O);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, this.zab, i);
        int i2 = this.zac;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 4, this.zad, i);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
