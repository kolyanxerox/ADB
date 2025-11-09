package o00OOO0;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o0OO00O {

    /* renamed from: OooO00o */
    public final o0OoOo0 f32277OooO00o;

    /* renamed from: OooO0O0 */
    public final String f32278OooO0O0;

    /* renamed from: OooO0OO */
    public final o000oOoO f32279OooO0OO;

    /* renamed from: OooO0Oo */
    public final o0O0O00 f32280OooO0Oo;

    /* renamed from: OooO0o */
    public volatile OooO0o f32281OooO0o;

    /* renamed from: OooO0o0 */
    public final Map f32282OooO0o0;

    public o0OO00O(OooOOo0.o0OOO0o o0ooo0o) {
        this.f32277OooO00o = (o0OoOo0) o0ooo0o.f13518OooOo0o;
        this.f32278OooO0O0 = (String) o0ooo0o.f13516OooOo;
        o000Ooo.o00oO0o o00oo0o = (o000Ooo.o00oO0o) o0ooo0o.f13520OooOoO0;
        o00oo0o.getClass();
        this.f32279OooO0OO = new o000oOoO(o00oo0o);
        this.f32280OooO0Oo = (o0O0O00) o0ooo0o.f13519OooOoO;
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        Map map = (Map) o0ooo0o.f13521OooOoOO;
        this.f32282OooO0o0 = map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final OooOOo0.o0OOO0o OooO00o() {
        OooOOo0.o0OOO0o o0ooo0o = new OooOOo0.o0OOO0o(false);
        Object linkedHashMap = Collections.EMPTY_MAP;
        o0ooo0o.f13521OooOoOO = linkedHashMap;
        o0ooo0o.f13518OooOo0o = this.f32277OooO00o;
        o0ooo0o.f13516OooOo = this.f32278OooO0O0;
        o0ooo0o.f13519OooOoO = this.f32280OooO0Oo;
        Map map = this.f32282OooO0o0;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        o0ooo0o.f13521OooOoOO = linkedHashMap;
        o0ooo0o.f13520OooOoO0 = this.f32279OooO0OO.OooO0o0();
        return o0ooo0o;
    }

    public final String toString() {
        return "Request{method=" + this.f32278OooO0O0 + ", url=" + this.f32277OooO00o + ", tags=" + this.f32282OooO0o0 + '}';
    }
}
