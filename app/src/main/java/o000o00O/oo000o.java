package o000o00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oo000o implements o000OO0o.OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ oo000o[] f30891OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final oo000o f30892OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f30893OooOo0O;

    static {
        oo000o oo000oVar = new oo000o("EVENT_TYPE_UNKNOWN", 0, 0);
        oo000o oo000oVar2 = new oo000o("SESSION_START", 1, 1);
        f30892OooOo0o = oo000oVar2;
        oo000o[] oo000oVarArr = {oo000oVar, oo000oVar2};
        f30891OooOo = oo000oVarArr;
        o000O00.o00O0O0O.OooOOo(oo000oVarArr);
    }

    public oo000o(String str, int i, int i2) {
        this.f30893OooOo0O = i2;
    }

    public static oo000o valueOf(String str) {
        return (oo000o) Enum.valueOf(oo000o.class, str);
    }

    public static oo000o[] values() {
        return (oo000o[]) f30891OooOo.clone();
    }

    @Override // o000OO0o.OooOOO
    public final int getNumber() {
        return this.f30893OooOo0O;
    }
}
