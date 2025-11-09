package o00000o0;

import com.google.android.gms.internal.measurement.oO00Oo0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00000 implements o000000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f29272OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile oO00Oo0 f29273OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile boolean f29274OooOo0o;

    @Override // o00000o0.o000000
    public final Object get() {
        if (!this.f29274OooOo0o) {
            synchronized (this) {
                try {
                    if (!this.f29274OooOo0o) {
                        oO00Oo0 oo00oo0 = this.f29273OooOo0O;
                        Objects.requireNonNull(oo00oo0);
                        Object obj = oo00oo0.get();
                        this.f29272OooOo = obj;
                        this.f29274OooOo0o = true;
                        this.f29273OooOo0O = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f29272OooOo;
    }

    public final String toString() {
        Object string = this.f29273OooOo0O;
        if (string == null) {
            String strValueOf = String.valueOf(this.f29272OooOo);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
