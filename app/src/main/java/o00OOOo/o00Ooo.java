package o00OOoo;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import kotlin.jvm.internal.o0OOO0o;
import o00OOOoO.o000O0O0;

/* loaded from: classes3.dex */
public final class o00Ooo extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f32630OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.oo000o f32631OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f32632OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f32633OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f32634OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f32635OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(kotlin.jvm.internal.oo000o oo000oVar, long j, o0OOO0o o0ooo0o, o000O0O0 o000o0o02, o0OOO0o o0ooo0o2, o0OOO0o o0ooo0o3) {
        super(2);
        this.f32631OooOo0O = oo000oVar;
        this.f32632OooOo0o = j;
        this.f32630OooOo = o0ooo0o;
        this.f32634OooOoO0 = o000o0o02;
        this.f32633OooOoO = o0ooo0o2;
        this.f32635OooOoOO = o0ooo0o3;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            kotlin.jvm.internal.oo000o oo000oVar = this.f32631OooOo0O;
            if (oo000oVar.f28883OooOo0O) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            oo000oVar.f28883OooOo0O = true;
            if (jLongValue < this.f32632OooOo0o) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            o0OOO0o o0ooo0o = this.f32630OooOo;
            long longLe = o0ooo0o.f28879OooOo0O;
            o000O0O0 o000o0o02 = this.f32634OooOoO0;
            if (longLe == KeyboardMap.kValueMask) {
                longLe = o000o0o02.readLongLe();
            }
            o0ooo0o.f28879OooOo0O = longLe;
            o0OOO0o o0ooo0o2 = this.f32633OooOoO;
            o0ooo0o2.f28879OooOo0O = o0ooo0o2.f28879OooOo0O == KeyboardMap.kValueMask ? o000o0o02.readLongLe() : 0L;
            o0OOO0o o0ooo0o3 = this.f32635OooOoOO;
            o0ooo0o3.f28879OooOo0O = o0ooo0o3.f28879OooOo0O == KeyboardMap.kValueMask ? o000o0o02.readLongLe() : 0L;
        }
        return oo00o.OooOo.f33195OooO00o;
    }
}
