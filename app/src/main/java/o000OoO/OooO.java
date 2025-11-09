package o000OOO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class OooO implements o000OO00.OooO {

    /* renamed from: OooO, reason: collision with root package name */
    public static final o000OO0o.OooO0o f30234OooO;

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final Charset f30235OooO0o = Charset.forName("UTF-8");

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final o000OO00.OooO0OO f30236OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final o000OO00.OooO0OO f30237OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public OutputStream f30238OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f30239OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f30240OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OO0o.OooO0o f30241OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f30242OooO0o0 = new OooOOO0(this);

    static {
        OooO00o oooO00o = new OooO00o(1);
        HashMap map = new HashMap();
        map.put(OooO0o.class, oooO00o);
        f30236OooO0oO = new o000OO00.OooO0OO("key", Collections.unmodifiableMap(new HashMap(map)));
        OooO00o oooO00o2 = new OooO00o(2);
        HashMap map2 = new HashMap();
        map2.put(OooO0o.class, oooO00o2);
        f30237OooO0oo = new o000OO00.OooO0OO("value", Collections.unmodifiableMap(new HashMap(map2)));
        f30234OooO = new o000OO0o.OooO0o(1);
    }

    public OooO(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, o000OO0o.OooO0o oooO0o) {
        this.f30238OooO00o = byteArrayOutputStream;
        this.f30239OooO0O0 = map;
        this.f30240OooO0OO = map2;
        this.f30241OooO0Oo = oooO0o;
    }

    public static int OooOO0(o000OO00.OooO0OO oooO0OO) {
        OooO0o oooO0o = (OooO0o) ((Annotation) oooO0OO.f30196OooO0O0.get(OooO0o.class));
        if (oooO0o != null) {
            return ((OooO00o) oooO0o).f30243OooO00o;
        }
        throw new o000OO00.OooO0O0("Field has no @Protobuf config");
    }

    public final void OooO(o000OO00.OooO0o oooO0o, o000OO00.OooO0OO oooO0OO, Object obj, boolean z) throws IOException {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f30244OooOo0O = 0L;
        try {
            OutputStream outputStream = this.f30238OooO00o;
            this.f30238OooO00o = oooO0O0;
            try {
                oooO0o.OooO00o(obj, this);
                this.f30238OooO00o = outputStream;
                long j = oooO0O0.f30244OooOo0O;
                oooO0O0.close();
                if (z && j == 0) {
                    return;
                }
                OooOO0O((OooOO0(oooO0OO) << 3) | 2);
                OooOO0o(j);
                oooO0o.OooO00o(obj, this);
            } catch (Throwable th) {
                this.f30238OooO00o = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                oooO0O0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void OooO00o(o000OO00.OooO0OO oooO0OO, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        OooOO0O((OooOO0(oooO0OO) << 3) | 1);
        this.f30238OooO00o.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0O0(o000OO00.OooO0OO oooO0OO, Object obj) {
        OooO0oo(oooO0OO, obj, true);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0OO(o000OO00.OooO0OO oooO0OO, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        OooO0o oooO0o = (OooO0o) ((Annotation) oooO0OO.f30196OooO0O0.get(OooO0o.class));
        if (oooO0o == null) {
            throw new o000OO00.OooO0O0("Field has no @Protobuf config");
        }
        OooOO0O(((OooO00o) oooO0o).f30243OooO00o << 3);
        OooOO0o(j);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0Oo(o000OO00.OooO0OO oooO0OO, int i) {
        OooO0oO(oooO0OO, i, true);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0o(o000OO00.OooO0OO oooO0OO, boolean z) {
        OooO0oO(oooO0OO, z ? 1 : 0, true);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0o0(o000OO00.OooO0OO oooO0OO, double d) throws IOException {
        OooO00o(oooO0OO, d, true);
        return this;
    }

    public final void OooO0oO(o000OO00.OooO0OO oooO0OO, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        OooO0o oooO0o = (OooO0o) ((Annotation) oooO0OO.f30196OooO0O0.get(OooO0o.class));
        if (oooO0o == null) {
            throw new o000OO00.OooO0O0("Field has no @Protobuf config");
        }
        OooOO0O(((OooO00o) oooO0o).f30243OooO00o << 3);
        OooOO0O(i);
    }

    public final void OooO0oo(o000OO00.OooO0OO oooO0OO, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            OooOO0O((OooOO0(oooO0OO) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f30235OooO0o);
            OooOO0O(bytes.length);
            this.f30238OooO00o.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                OooO0oo(oooO0OO, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO(f30234OooO, oooO0OO, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            OooO00o(oooO0OO, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            OooOO0O((OooOO0(oooO0OO) << 3) | 5);
            this.f30238OooO00o.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            OooO0o oooO0o = (OooO0o) ((Annotation) oooO0OO.f30196OooO0O0.get(OooO0o.class));
            if (oooO0o == null) {
                throw new o000OO00.OooO0O0("Field has no @Protobuf config");
            }
            OooOO0O(((OooO00o) oooO0o).f30243OooO00o << 3);
            OooOO0o(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            OooO0oO(oooO0OO, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            OooOO0O((OooOO0(oooO0OO) << 3) | 2);
            OooOO0O(bArr.length);
            this.f30238OooO00o.write(bArr);
            return;
        }
        o000OO00.OooO0o oooO0o2 = (o000OO00.OooO0o) this.f30239OooO0O0.get(obj.getClass());
        if (oooO0o2 != null) {
            OooO(oooO0o2, oooO0OO, obj, z);
            return;
        }
        o000OO00.OooOO0 oooOO0 = (o000OO00.OooOO0) this.f30240OooO0OO.get(obj.getClass());
        if (oooOO0 != null) {
            OooOOO0 oooOOO0 = this.f30242OooO0o0;
            oooOOO0.f30251OooO00o = false;
            oooOOO0.f30253OooO0OO = oooO0OO;
            oooOOO0.f30252OooO0O0 = z;
            oooOO0.OooO00o(obj, oooOOO0);
            return;
        }
        if (obj instanceof OooOo00.OooO0OO) {
            OooO0oO(oooO0OO, ((OooOo00.OooO0OO) obj).f13588OooOo0O, true);
        } else if (obj instanceof Enum) {
            OooO0oO(oooO0OO, ((Enum) obj).ordinal(), true);
        } else {
            OooO(this.f30241OooO0Oo, oooO0OO, obj, z);
        }
    }

    public final void OooOO0O(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f30238OooO00o.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f30238OooO00o.write(i & 127);
    }

    public final void OooOO0o(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f30238OooO00o.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f30238OooO00o.write(((int) j) & 127);
    }
}
