package o00OOOO0;

import java.util.ArrayList;
import o00OOO0.o000000;
import o00OOO0.o00O0O;
import o00OOO0.o0OO00O;
import o00OOO0.o0Oo0oo;

/* loaded from: classes3.dex */
public final class OooOO0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final int f32376OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f32377OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO.OooO f32378OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f32379OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOO.OooO0O0 f32380OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O f32381OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f32382OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final o0Oo0oo f32383OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final o00OOO0.OooO0O0 f32384OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final int f32385OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final int f32386OooOO0O;
    public int OooOO0o;

    public OooOO0(ArrayList arrayList, o00OOO.OooO oooO, OooO0OO oooO0OO, o00OOO.OooO0O0 oooO0O0, int i, o0OO00O o0oo00o, o0Oo0oo o0oo0oo, o00OOO0.OooO0O0 oooO0O02, int i2, int i3, int i4) {
        this.f32377OooO00o = arrayList;
        this.f32380OooO0Oo = oooO0O0;
        this.f32378OooO0O0 = oooO;
        this.f32379OooO0OO = oooO0OO;
        this.f32382OooO0o0 = i;
        this.f32381OooO0o = o0oo00o;
        this.f32383OooO0oO = o0oo0oo;
        this.f32384OooO0oo = oooO0O02;
        this.f32376OooO = i2;
        this.f32385OooOO0 = i3;
        this.f32386OooOO0O = i4;
    }

    public final o000000 OooO00o(o0OO00O o0oo00o, o00OOO.OooO oooO, OooO0OO oooO0OO, o00OOO.OooO0O0 oooO0O0) {
        ArrayList arrayList = this.f32377OooO00o;
        int size = arrayList.size();
        int i = this.f32382OooO0o0;
        if (i >= size) {
            throw new AssertionError();
        }
        this.OooOO0o++;
        OooO0OO oooO0OO2 = this.f32379OooO0OO;
        if (oooO0OO2 != null) {
            if (!this.f32380OooO0Oo.OooOO0(o0oo00o.f32277OooO00o)) {
                throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
            }
        }
        if (oooO0OO2 != null && this.OooOO0o > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        OooOO0 oooOO0 = new OooOO0(arrayList, oooO, oooO0OO, oooO0O0, i2, o0oo00o, this.f32383OooO0oO, this.f32384OooO0oo, this.f32376OooO, this.f32385OooOO0, this.f32386OooOO0O);
        o00O0O o00o0o = (o00O0O) arrayList.get(i);
        o000000 o000000VarOooO00o = o00o0o.OooO00o(oooOO0);
        if (oooO0OO != null && i2 < arrayList.size() && oooOO0.OooOO0o != 1) {
            throw new IllegalStateException("network interceptor " + o00o0o + " must call proceed() exactly once");
        }
        if (o000000VarOooO00o == null) {
            throw new NullPointerException("interceptor " + o00o0o + " returned null");
        }
        if (o000000VarOooO00o.f32215OooOoo0 != null) {
            return o000000VarOooO00o;
        }
        throw new IllegalStateException("interceptor " + o00o0o + " returned a response with no body");
    }
}
