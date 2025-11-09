package o00OOooo;

import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;
import o00OoOoO.o00O0O00;

/* loaded from: classes3.dex */
public abstract class o00O0 extends o00O00o0 {
    static {
        OpenOption[] openOptionArr = o00O0O00.f32700OooO00o;
    }

    public o00O0() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: o00OOooo.oo00o
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                this.f32649OooO00o.getClass();
                if (i <= Integer.MAX_VALUE) {
                    return i;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.MAX_VALUE));
            }
        };
    }
}
