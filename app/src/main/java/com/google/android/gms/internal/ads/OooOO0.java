package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class OooOO0 {

    /* renamed from: OooOOO */
    public static final sb1 f16795OooOOO = new sb1();

    /* renamed from: OooO */
    public u41 f16796OooO;

    /* renamed from: OooO00o */
    public final OooO0OO f16797OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOOO0 f16798OooO0O0;

    /* renamed from: OooO0OO */
    public final OooOo f16799OooO0OO;

    /* renamed from: OooO0Oo */
    public final OooO f16800OooO0Oo;

    /* renamed from: OooO0o */
    public final bi0 f16801OooO0o;

    /* renamed from: OooO0o0 */
    public final gn0 f16802OooO0o0;

    /* renamed from: OooO0oO */
    public final k50 f16803OooO0oO;

    /* renamed from: OooO0oo */
    public final CopyOnWriteArraySet f16804OooO0oo;

    /* renamed from: OooOO0 */
    public m60 f16805OooOO0;

    /* renamed from: OooOO0O */
    public Pair f16806OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0 */
    public int f16807OooOOO0;

    public OooOO0(OooO0oO.o0OoOo0 o0oooo0) {
        OooO0OO oooO0OO = new OooO0OO(this, o0oooo0.f13292OooO00o);
        this.f16797OooO00o = oooO0OO;
        k50 k50Var = (k50) o0oooo0.f13298OooO0oO;
        this.f16803OooO0oO = k50Var;
        OooOOO0 oooOOO0 = (OooOOO0) o0oooo0.f13294OooO0OO;
        this.f16798OooO0O0 = oooOOO0;
        oooOOO0.f16822OooOO0O = k50Var;
        OooOo oooOo = new OooOo(new dx0(this), oooOOO0);
        this.f16799OooO0OO = oooOo;
        OooO oooO = (OooO) o0oooo0.f13297OooO0o0;
        af0.OooOo0O(oooO);
        this.f16800OooO0Oo = oooO;
        this.f16802OooO0o0 = (gn0) o0oooo0.f13296OooO0o;
        this.f16801OooO0o = new bi0(oooOOO0, oooOo);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f16804OooO0oo = copyOnWriteArraySet;
        this.f16807OooOOO0 = 0;
        new o0OoOo0(new jb1());
        copyOnWriteArraySet.add(oooO0OO);
    }

    public static void OooO00o(OooOO0 oooOO0, long j, long j2) throws o00Ooo {
        bi0 bi0Var = oooOO0.f16801OooO0o;
        bi0Var.getClass();
        try {
            ((OooOo) bi0Var.f17507OooOo).OooO00o(j, j2);
        } catch (l41 e) {
            throw new o00Ooo(e, (o0OoOo0) bi0Var.f17510OooOoO0);
        }
    }
}
