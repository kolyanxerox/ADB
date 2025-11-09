package o000OO0o;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o000OO00.OooO0O0;
import o000OO00.OooO0OO;

/* loaded from: classes2.dex */
public final class OooOOO0 implements o000OO00.OooO, o000OO00.OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f30228OooO00o = true;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final JsonWriter f30229OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f30230OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f30231OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f30232OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f30233OooO0o0;

    public OooOOO0(Writer writer, HashMap map, HashMap map2, OooO0o oooO0o, boolean z) {
        this.f30229OooO0O0 = new JsonWriter(writer);
        this.f30230OooO0OO = map;
        this.f30231OooO0Oo = map2;
        this.f30233OooO0o0 = oooO0o;
        this.f30232OooO0o = z;
    }

    public final OooOOO0 OooO(Object obj, String str) throws IOException {
        boolean z = this.f30232OooO0o;
        JsonWriter jsonWriter = this.f30229OooO0O0;
        if (z) {
            if (obj == null) {
                return this;
            }
            OooOO0();
            jsonWriter.name(str);
            OooO0oo(obj);
            return this;
        }
        OooOO0();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        OooO0oo(obj);
        return this;
    }

    @Override // o000OO00.OooOO0O
    public final o000OO00.OooOO0O OooO00o(String str) throws IOException {
        OooOO0();
        this.f30229OooO0O0.value(str);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0O0(OooO0OO oooO0OO, Object obj) throws IOException {
        OooO(obj, oooO0OO.f30195OooO00o);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0OO(OooO0OO oooO0OO, long j) throws IOException {
        String str = oooO0OO.f30195OooO00o;
        OooOO0();
        JsonWriter jsonWriter = this.f30229OooO0O0;
        jsonWriter.name(str);
        OooOO0();
        jsonWriter.value(j);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0Oo(OooO0OO oooO0OO, int i) throws IOException {
        String str = oooO0OO.f30195OooO00o;
        OooOO0();
        JsonWriter jsonWriter = this.f30229OooO0O0;
        jsonWriter.name(str);
        OooOO0();
        jsonWriter.value(i);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0o(OooO0OO oooO0OO, boolean z) throws IOException {
        String str = oooO0OO.f30195OooO00o;
        OooOO0();
        JsonWriter jsonWriter = this.f30229OooO0O0;
        jsonWriter.name(str);
        OooOO0();
        jsonWriter.value(z);
        return this;
    }

    @Override // o000OO00.OooO
    public final o000OO00.OooO OooO0o0(OooO0OO oooO0OO, double d) throws IOException {
        String str = oooO0OO.f30195OooO00o;
        OooOO0();
        JsonWriter jsonWriter = this.f30229OooO0O0;
        jsonWriter.name(str);
        OooOO0();
        jsonWriter.value(d);
        return this;
    }

    @Override // o000OO00.OooOO0O
    public final o000OO00.OooOO0O OooO0oO(boolean z) throws IOException {
        OooOO0();
        this.f30229OooO0O0.value(z);
        return this;
    }

    public final OooOOO0 OooO0oo(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f30229OooO0O0;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    OooO0oo(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        OooO(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new OooO0O0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            o000OO00.OooO0o oooO0o = (o000OO00.OooO0o) this.f30230OooO0OO.get(obj.getClass());
            if (oooO0o != null) {
                jsonWriter.beginObject();
                oooO0o.OooO00o(obj, this);
                jsonWriter.endObject();
                return this;
            }
            o000OO00.OooOO0 oooOO0 = (o000OO00.OooOO0) this.f30231OooO0Oo.get(obj.getClass());
            if (oooOO0 != null) {
                oooOO0.OooO00o(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f30233OooO0o0.OooO00o(obj, this);
                throw null;
            }
            if (obj instanceof OooOOO) {
                int number = ((OooOOO) obj).getNumber();
                OooOO0();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            OooOO0();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            OooOO0();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                OooOO0();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                OooO0oo(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                OooO0oo(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final void OooOO0() {
        if (!this.f30228OooO00o) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
