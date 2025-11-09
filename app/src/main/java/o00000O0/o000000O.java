package o00000o0;

import com.google.android.gms.internal.measurement.oO00Oo0;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o000000O implements o000000, Serializable {

    /* renamed from: OooOo, reason: collision with root package name */
    public transient Object f29275OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final oO00Oo0 f29276OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile transient boolean f29277OooOo0o;

    public o000000O(oO00Oo0 oo00oo0) {
        this.f29276OooOo0O = oo00oo0;
    }

    @Override // o00000o0.o000000
    public final Object get() {
        if (!this.f29277OooOo0o) {
            synchronized (this) {
                try {
                    if (!this.f29277OooOo0o) {
                        Object obj = this.f29276OooOo0O.get();
                        this.f29275OooOo = obj;
                        this.f29277OooOo0o = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f29275OooOo;
    }

    public final String toString() {
        Object string;
        if (this.f29277OooOo0o) {
            String strValueOf = String.valueOf(this.f29275OooOo);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f29276OooOo0O;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
