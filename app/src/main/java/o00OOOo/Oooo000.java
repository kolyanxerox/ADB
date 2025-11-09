package o00OOoo;

import OooO00o.OooO00o;
import OoooOOO.o0O00000;
import OoooOOO.oO000Oo;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o0OOO0o;
import kotlin.jvm.internal.o0Oo0oo;
import o00O0.OooOo00;
import o00O0.o0O0O00;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import o00OOOoO.o0000;
import o00OOOoO.o000O0O0;
import o00OOOoO.o000O0Oo;
import o00OOOoO.o000OOo0;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public abstract class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f32616OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int OooO00o(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final LinkedHashMap OooO0O0(ArrayList arrayList) {
        String str = o000O0Oo.f32579OooOo0o;
        o000O0Oo o000o0ooOooO = o0O00000.OooO("/", false);
        LinkedHashMap linkedHashMapOooOOo = o0O0O00.OooOOo(new OooOO0(o000o0ooOooO, new o00Oo0(o000o0ooOooO)));
        for (o00Oo0 o00oo0 : OooOo00.Oooo0(arrayList, new oO000Oo(2))) {
            if (((o00Oo0) linkedHashMapOooOOo.put(o00oo0.f32622OooO00o, o00oo0)) == null) {
                while (true) {
                    o000O0Oo o000o0oo2 = o00oo0.f32622OooO00o;
                    o000O0Oo o000o0ooOooO0OO = o000o0oo2.OooO0OO();
                    if (o000o0ooOooO0OO != null) {
                        o00Oo0 o00oo02 = (o00Oo0) linkedHashMapOooOOo.get(o000o0ooOooO0OO);
                        if (o00oo02 != null) {
                            o00oo02.f32629OooO0oo.add(o000o0oo2);
                            break;
                        }
                        o00Oo0 o00oo03 = new o00Oo0(o000o0ooOooO0OO);
                        linkedHashMapOooOOo.put(o000o0ooOooO0OO, o00oo03);
                        o00oo03.f32629OooO0oo.add(o000o0oo2);
                        o00oo0 = o00oo03;
                    }
                }
            }
        }
        return linkedHashMapOooOOo;
    }

    public static final String OooO0OO(int i) {
        OooO00o.OooO00o(16);
        String string = Integer.toString(i, 16);
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final o00Oo0 OooO0Oo(o000O0O0 o000o0o02) throws IOException {
        Long lValueOf;
        int intLe = o000o0o02.readIntLe();
        if (intLe != 33639248) {
            throw new IOException("bad zip: expected " + OooO0OO(33639248) + " but was " + OooO0OO(intLe));
        }
        o000o0o02.skip(4L);
        short shortLe = o000o0o02.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + OooO0OO(i));
        }
        int shortLe2 = o000o0o02.readShortLe() & 65535;
        short shortLe3 = o000o0o02.readShortLe();
        int i2 = shortLe3 & 65535;
        short shortLe4 = o000o0o02.readShortLe();
        int i3 = shortLe4 & 65535;
        if (i2 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i3 >> 9) & 127) + 1980, ((i3 >> 5) & 15) - 1, shortLe4 & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (shortLe3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = lValueOf;
        o000o0o02.readIntLe();
        o0OOO0o o0ooo0o = new o0OOO0o();
        o0ooo0o.f28879OooOo0O = o000o0o02.readIntLe() & KeyboardMap.kValueMask;
        o0OOO0o o0ooo0o2 = new o0OOO0o();
        o0ooo0o2.f28879OooOo0O = o000o0o02.readIntLe() & KeyboardMap.kValueMask;
        int shortLe5 = o000o0o02.readShortLe() & 65535;
        int shortLe6 = o000o0o02.readShortLe() & 65535;
        int shortLe7 = o000o0o02.readShortLe() & 65535;
        o000o0o02.skip(8L);
        o0OOO0o o0ooo0o3 = new o0OOO0o();
        o0ooo0o3.f28879OooOo0O = o000o0o02.readIntLe() & KeyboardMap.kValueMask;
        String utf8 = o000o0o02.readUtf8(shortLe5);
        if (o000000.Oooo0o0(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = o0ooo0o2.f28879OooOo0O == KeyboardMap.kValueMask ? 8 : 0L;
        if (o0ooo0o.f28879OooOo0O == KeyboardMap.kValueMask) {
            j += 8;
        }
        if (o0ooo0o3.f28879OooOo0O == KeyboardMap.kValueMask) {
            j += 8;
        }
        kotlin.jvm.internal.oo000o oo000oVar = new kotlin.jvm.internal.oo000o();
        OooO0o0(o000o0o02, shortLe6, new o00Ooo(oo000oVar, j, o0ooo0o2, o000o0o02, o0ooo0o, o0ooo0o3));
        if (j > 0 && !oo000oVar.f28883OooOo0O) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String utf82 = o000o0o02.readUtf8(shortLe7);
        String str = o000O0Oo.f32579OooOo0o;
        return new o00Oo0(o0O00000.OooO("/", false).OooO0Oo(utf8), o0000O00.OooOooo(utf8, "/", false), utf82, o0ooo0o.f28879OooOo0O, o0ooo0o2.f28879OooOo0O, shortLe2, l, o0ooo0o3.f28879OooOo0O);
    }

    public static final o000oo00.Oooo000 OooO0o(o000O0O0 o000o0o02, o000oo00.Oooo000 oooo000) throws IOException {
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        o0oo0oo.f28880OooOo0O = oooo000 != null ? (Long) oooo000.f31092OooO0o : null;
        o0Oo0oo o0oo0oo2 = new o0Oo0oo();
        o0Oo0oo o0oo0oo3 = new o0Oo0oo();
        int intLe = o000o0o02.readIntLe();
        if (intLe != 67324752) {
            throw new IOException("bad zip: expected " + OooO0OO(67324752) + " but was " + OooO0OO(intLe));
        }
        o000o0o02.skip(2L);
        short shortLe = o000o0o02.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + OooO0OO(i));
        }
        o000o0o02.skip(18L);
        long shortLe2 = o000o0o02.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = o000o0o02.readShortLe() & 65535;
        o000o0o02.skip(shortLe2);
        if (oooo000 == null) {
            o000o0o02.skip(shortLe3);
            return null;
        }
        OooO0o0(o000o0o02, shortLe3, new oo000o(o000o0o02, o0oo0oo, o0oo0oo2, o0oo0oo3));
        return new o000oo00.Oooo000(oooo000.f31089OooO0O0, oooo000.f31090OooO0OO, (Long) oooo000.f31091OooO0Oo, (Long) o0oo0oo3.f28880OooOo0O, (Long) o0oo0oo.f28880OooOo0O, (Long) o0oo0oo2.f28880OooOo0O);
    }

    public static final void OooO0o0(o000O0O0 o000o0o02, int i, o00O0Oo.o00O0O o00o0o) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = o000o0o02.readShortLe() & 65535;
            long shortLe2 = o000o0o02.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            o000o0o02.require(shortLe2);
            o0000 o0000Var = o000o0o02.f32578OooOo0o;
            long j3 = o0000Var.f32535OooOo0o;
            o00o0o.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long j4 = (o0000Var.f32535OooOo0o + shortLe2) - j3;
            if (j4 < 0) {
                throw new IOException(OooO0oO.OooOo.OooO0o(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                o0000Var.skip(j4);
            }
            j = j2 - shortLe2;
        }
    }

    public static final int OooO0oO(o000OOo0 o000ooo02, int i) {
        int i2;
        kotlin.jvm.internal.OooOo.OooO0o0(o000ooo02, "<this>");
        int i3 = i + 1;
        int length = o000ooo02.f32594OooOoO.length;
        int[] iArr = o000ooo02.f32595OooOoOO;
        kotlin.jvm.internal.OooOo.OooO0o0(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
