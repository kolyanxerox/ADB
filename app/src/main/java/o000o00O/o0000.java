package o000o00o;

/* loaded from: classes2.dex */
public final class o0000 extends Enum implements o000OO0o.OooOOO {

    /* renamed from: OooOo */
    public static final /* synthetic */ o0000[] f30734OooOo;

    /* renamed from: OooOo0o */
    public static final o0000 f30735OooOo0o;

    /* renamed from: OooOo0O */
    public final int f30736OooOo0O;

    static {
        o0000 o0000Var = new o0000("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        o0000 o0000Var2 = new o0000("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        o0000 o0000Var3 = new o0000("LOG_ENVIRONMENT_STAGING", 2, 2);
        o0000 o0000Var4 = new o0000("LOG_ENVIRONMENT_PROD", 3, 3);
        f30735OooOo0o = o0000Var4;
        o0000[] o0000VarArr = {o0000Var, o0000Var2, o0000Var3, o0000Var4};
        f30734OooOo = o0000VarArr;
        o000O00.o00O0O0O.OooOOo(o0000VarArr);
    }

    public o0000(String str, int i, int i2) {
        super(str, i);
        this.f30736OooOo0O = i2;
    }

    public static o0000 valueOf(String str) {
        return (o0000) Enum.valueOf(o0000.class, str);
    }

    public static o0000[] values() {
        return (o0000[]) f30734OooOo.clone();
    }

    @Override // o000OO0o.OooOOO
    public final int getNumber() {
        return this.f30736OooOo0O;
    }
}
