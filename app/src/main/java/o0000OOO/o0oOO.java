package o0000Ooo;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class o0oOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f29557OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f29558OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f29559OooO0OO;

    public o0oOO(Object obj, Object obj2, Object obj3) {
        this.f29557OooO00o = obj;
        this.f29558OooO0O0 = obj2;
        this.f29559OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        Object obj = this.f29557OooO00o;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f29558OooO0O0);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f29559OooO0OO);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append(C3034d9.i.f8173b);
        sb.append(strValueOf2);
        return new IllegalArgumentException(OooO00o.OooOOO(sb, " and ", strValueOf3, C3034d9.i.f8173b, strValueOf4));
    }
}
