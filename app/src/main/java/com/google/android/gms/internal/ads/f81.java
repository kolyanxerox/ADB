package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class f81 implements u51 {

    /* renamed from: o0000oO */
    public static final byte[] f18815o0000oO = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: OooOo */
    public final dx0 f18816OooOo;

    /* renamed from: OooOo0O */
    public final Object f18817OooOo0O;

    /* renamed from: OooOo0o */
    public final int f18818OooOo0o;

    /* renamed from: OooOoO */
    public int f18819OooOoO;

    /* renamed from: OooOoO0 */
    public y51 f18820OooOoO0;

    /* renamed from: OooOoOO */
    public o61 f18821OooOoOO;

    /* renamed from: OooOoo */
    public int f18822OooOoo;

    /* renamed from: OooOoo0 */
    public k50 f18823OooOoo0;

    /* renamed from: OooOooO */
    public ba1 f18824OooOooO;

    /* renamed from: OooOooo */
    public o0OoOo0[] f18825OooOooo;

    /* renamed from: Oooo */
    public final c41 f18826Oooo;

    /* renamed from: Oooo0 */
    public boolean f18827Oooo0;

    /* renamed from: Oooo000 */
    public long f18828Oooo000;

    /* renamed from: Oooo00O */
    public long f18829Oooo00O;

    /* renamed from: Oooo00o */
    public long f18830Oooo00o;

    /* renamed from: Oooo0O0 */
    public boolean f18831Oooo0O0;

    /* renamed from: Oooo0OO */
    public AbstractC1787lf f18832Oooo0OO;

    /* renamed from: Oooo0o */
    public final nh0 f18833Oooo0o;

    /* renamed from: Oooo0o0 */
    public xa1 f18834Oooo0o0;

    /* renamed from: Oooo0oO */
    public final o0O f18835Oooo0oO;

    /* renamed from: Oooo0oo */
    public final float f18836Oooo0oo;

    /* renamed from: OoooO */
    public final MediaCodec.BufferInfo f18837OoooO;

    /* renamed from: OoooO0 */
    public final c41 f18838OoooO0;

    /* renamed from: OoooO00 */
    public final c41 f18839OoooO00;

    /* renamed from: OoooO0O */
    public final x71 f18840OoooO0O;

    /* renamed from: OoooOO0 */
    public final ArrayDeque f18841OoooOO0;

    /* renamed from: OoooOOO */
    public o0OoOo0 f18842OoooOOO;

    /* renamed from: OoooOOo */
    public o0OoOo0 f18843OoooOOo;

    /* renamed from: OoooOo0 */
    public x41 f18844OoooOo0;

    /* renamed from: OoooOoO */
    public float f18845OoooOoO;

    /* renamed from: OoooOoo */
    public float f18846OoooOoo;

    /* renamed from: Ooooo00 */
    public z71 f18847Ooooo00;

    /* renamed from: Ooooo0o */
    public o0OoOo0 f18848Ooooo0o;

    /* renamed from: OooooO0 */
    public MediaFormat f18849OooooO0;

    /* renamed from: OooooOO */
    public boolean f18850OooooOO;

    /* renamed from: OooooOo */
    public float f18851OooooOo;

    /* renamed from: Oooooo */
    public d81 f18852Oooooo;

    /* renamed from: Oooooo0 */
    public ArrayDeque f18853Oooooo0;

    /* renamed from: OoooooO */
    public c81 f18854OoooooO;

    /* renamed from: Ooooooo */
    public int f18855Ooooooo;

    /* renamed from: o0000 */
    public boolean f18856o0000;

    /* renamed from: o00000 */
    public boolean f18857o00000;

    /* renamed from: o000000 */
    public int f18858o000000;

    /* renamed from: o000000O */
    public boolean f18859o000000O;

    /* renamed from: o000000o */
    public boolean f18860o000000o;

    /* renamed from: o00000O */
    public long f18861o00000O;

    /* renamed from: o00000O0 */
    public long f18862o00000O0;

    /* renamed from: o00000OO */
    public boolean f18863o00000OO;

    /* renamed from: o00000Oo */
    public boolean f18864o00000Oo;

    /* renamed from: o00000o0 */
    public boolean f18865o00000o0;

    /* renamed from: o00000oO */
    public e81 f18866o00000oO;

    /* renamed from: o00000oo */
    public long f18867o00000oo;

    /* renamed from: o0000O00 */
    public pd0 f18868o0000O00;

    /* renamed from: o0000Ooo */
    public g41 f18869o0000Ooo;

    /* renamed from: o0000oo */
    public pd0 f18870o0000oo;

    /* renamed from: o000OOo */
    public int f18871o000OOo;
    public final o0O00O o000oOoO;

    /* renamed from: o00O0O */
    public boolean f18872o00O0O;

    /* renamed from: o00Oo0 */
    public boolean f18873o00Oo0;

    /* renamed from: o00Ooo */
    public boolean f18874o00Ooo;

    /* renamed from: o00o0O */
    public boolean f18875o00o0O;

    /* renamed from: o00oO0O */
    public int f18876o00oO0O;

    /* renamed from: o00oO0o */
    public int f18877o00oO0o;

    /* renamed from: o00ooo */
    public long f18878o00ooo;

    /* renamed from: o0O0O00 */
    public int f18879o0O0O00;

    /* renamed from: o0OO00O */
    public boolean f18880o0OO00O;

    /* renamed from: o0OOO0o */
    public boolean f18881o0OOO0o;

    /* renamed from: o0Oo0oo */
    public boolean f18882o0Oo0oo;

    /* renamed from: o0OoOo0 */
    public boolean f18883o0OoOo0;

    /* renamed from: o0ooOO0 */
    public ByteBuffer f18884o0ooOO0;
    public boolean o0ooOOo;
    public boolean o0ooOoO;

    /* renamed from: oo000o */
    public long f18885oo000o;

    /* renamed from: oo0o0Oo */
    public boolean f18886oo0o0Oo;

    /* renamed from: ooOO */
    public boolean f18887ooOO;

    public f81(int i, nh0 nh0Var, float f) {
        o0O o0o = o0O.f21861Oooo0;
        this.f18817OooOo0O = new Object();
        this.f18818OooOo0o = i;
        this.f18816OooOo = new dx0(3);
        this.f18830Oooo00o = Long.MIN_VALUE;
        this.f18832Oooo0OO = AbstractC1787lf.f20867OooO00o;
        this.f18833Oooo0o = nh0Var;
        this.f18835Oooo0oO = o0o;
        this.f18836Oooo0oo = f;
        this.f18826Oooo = new c41(0);
        this.f18839OoooO00 = new c41(0);
        this.f18838OoooO0 = new c41(2);
        x71 x71Var = new x71(2);
        x71Var.OooOO0o = 32;
        this.f18840OoooO0O = x71Var;
        this.f18837OoooO = new MediaCodec.BufferInfo();
        this.f18845OoooOoO = 1.0f;
        this.f18846OoooOoo = 1.0f;
        this.f18841OoooOO0 = new ArrayDeque();
        this.f18866o00000oO = e81.f18519OooO0o0;
        x71Var.OooO0o0(0);
        x71Var.f17682OooO0o0.order(ByteOrder.nativeOrder());
        o0O00O o0o00o = new o0O00O();
        o0o00o.f21878OooOo = InterfaceC1723jp.f20345OooO00o;
        o0o00o.f21880OooOo0o = 0;
        o0o00o.f21879OooOo0O = 2;
        this.o000oOoO = o0o00o;
        this.f18851OooooOo = -1.0f;
        this.f18855Ooooooo = 0;
        this.f18879o0O0O00 = 0;
        this.f18877o00oO0o = -1;
        this.f18876o00oO0O = -1;
        this.f18885oo000o = -9223372036854775807L;
        this.f18862o00000O0 = -9223372036854775807L;
        this.f18861o00000O = -9223372036854775807L;
        this.f18867o00000oo = -9223372036854775807L;
        this.f18878o00ooo = -9223372036854775807L;
        this.f18871o000OOo = 0;
        this.f18858o000000 = 0;
        this.f18869o0000Ooo = new g41();
    }

    public void OooO(float f, float f2) throws l41, d81 {
        this.f18845OoooOoO = f;
        this.f18846OoooOoo = f2;
        Oooo000(this.f18848Ooooo0o);
    }

    public abstract void OooO0OO();

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        if (r4 >= r0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0oO(com.google.android.gms.internal.ads.o0OoOo0[] r13, long r14, long r16, com.google.android.gms.internal.ads.h91 r18) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.e81 r13 = r12.f18866o00000oO
            long r0 = r13.f18522OooO0OO
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.gms.internal.ads.e81 r4 = new com.google.android.gms.internal.ads.e81
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.OooOoo0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f18841OoooOO0
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f18862o00000O0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f18867o00000oo
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            com.google.android.gms.internal.ads.e81 r5 = new com.google.android.gms.internal.ads.e81
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.OooOoo0(r5)
            com.google.android.gms.internal.ads.e81 r13 = r12.f18866o00000oO
            long r13 = r13.f18522OooO0OO
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.OoooOO0()
        L51:
            return
        L52:
            com.google.android.gms.internal.ads.e81 r5 = new com.google.android.gms.internal.ads.e81
            long r6 = r12.f18862o00000O0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f81.OooO0oO(com.google.android.gms.internal.ads.o0OoOo0[], long, long, com.google.android.gms.internal.ads.h91):void");
    }

    public final void OooO0oo(o0OoOo0[] o0oooo0Arr, ba1 ba1Var, long j, long j2, h91 h91Var) {
        af0.OooooO0(!this.f18827Oooo0);
        this.f18824OooOooO = ba1Var;
        if (this.f18830Oooo00o == Long.MIN_VALUE) {
            this.f18830Oooo00o = j;
        }
        this.f18825OooOooo = o0oooo0Arr;
        this.f18828Oooo000 = j2;
        OooO0oO(o0oooo0Arr, j, j2, h91Var);
    }

    public final boolean OooOO0() {
        return this.f18830Oooo00o == Long.MIN_VALUE;
    }

    public abstract String OooOO0O();

    /* JADX WARN: Code restructure failed: missing block: B:683:0x01fc, code lost:
    
        r29.f18882o0Oo0oo = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x03b6, code lost:
    
        r26 = r5;
        r27 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x03ba, code lost:
    
        throw r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0465, code lost:
    
        if (r29.f18875o00o0O != false) goto L855;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0467, code lost:
    
        r29.f18860o000000o = true;
        r4.OooO0Oo(r29.f18877o00oO0o, 0, 4, 0);
        r29.f18877o00oO0o = r3;
        r15.f17682OooO0o0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x047c, code lost:
    
        r29.f18871o000OOo = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x0526, code lost:
    
        r29.f18861o00000O = r29.f18862o00000O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:906:0x052c, code lost:
    
        if (r29.f18879o0O0O00 != 2) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x052e, code lost:
    
        r15.OooO0Oo();
        r29.f18879o0O0O00 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:908:0x0533, code lost:
    
        r29.f18863o00000OO = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0537, code lost:
    
        if (r29.f18859o000000O != false) goto L912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x0539, code lost:
    
        Oooo0oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x053f, code lost:
    
        if (r29.f18875o00o0O != false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x0541, code lost:
    
        r29.f18860o000000o = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0547, code lost:
    
        r12 = 1;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x0552, code lost:
    
        r4.OooO0Oo(r29.f18877o00oO0o, 0, 4, 0);
        r29.f18877o00oO0o = r3;
        r15.f17682OooO0o0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x0568, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x0569, code lost:
    
        r12 = true;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x056d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:928:0x056e, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x0675, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:1019:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:1115:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x014a A[Catch: IllegalStateException -> 0x00ad, CryptoException -> 0x00b1, TRY_ENTER, TryCatch #1 {CryptoException -> 0x00b1, blocks: (B:695:0x022b, B:1000:0x0699, B:607:0x00aa, B:615:0x00b8, B:617:0x00bc, B:619:0x00c2, B:623:0x00dc, B:624:0x00eb, B:628:0x00f8, B:630:0x00fe, B:685:0x020a, B:687:0x0210, B:688:0x0213, B:690:0x0219, B:692:0x021d, B:632:0x010c, B:634:0x0113, B:635:0x0123, B:637:0x0133, B:641:0x0142, B:642:0x0144, B:645:0x014a, B:647:0x014e, B:649:0x0158, B:651:0x0162, B:653:0x017f, B:654:0x018e, B:655:0x018f, B:656:0x0197, B:657:0x0198, B:659:0x019f, B:661:0x01a7, B:663:0x01af, B:664:0x01b6, B:669:0x01c9, B:671:0x01cf, B:672:0x01d5, B:674:0x01da, B:679:0x01f1, B:683:0x01fc, B:677:0x01e1, B:684:0x01ff, B:698:0x0235, B:700:0x0241, B:701:0x024e, B:703:0x0252, B:709:0x025e, B:711:0x0262, B:713:0x0266, B:724:0x028d, B:726:0x0293, B:728:0x029b, B:730:0x02a5, B:732:0x02ad, B:733:0x02b0, B:734:0x02b5, B:735:0x02b6, B:737:0x02ba, B:739:0x02be, B:743:0x02c6, B:745:0x02ca, B:994:0x0675, B:985:0x0641, B:984:0x063e, B:989:0x0657, B:991:0x0659, B:993:0x0674, B:748:0x02db, B:750:0x02e9, B:753:0x02f0, B:755:0x02f6, B:756:0x0300, B:758:0x0304, B:760:0x030a, B:761:0x030e, B:763:0x0318, B:764:0x0327, B:768:0x0333, B:774:0x0342, B:776:0x0350, B:778:0x0354, B:780:0x0358, B:782:0x0364, B:787:0x036f, B:789:0x0373, B:792:0x0381, B:996:0x067d, B:790:0x037d, B:783:0x0367, B:785:0x036b, B:715:0x026b, B:717:0x0272, B:719:0x027f, B:998:0x0680, B:999:0x0681), top: B:1028:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x01e1 A[Catch: IllegalStateException -> 0x00ad, CryptoException -> 0x00b1, TryCatch #1 {CryptoException -> 0x00b1, blocks: (B:695:0x022b, B:1000:0x0699, B:607:0x00aa, B:615:0x00b8, B:617:0x00bc, B:619:0x00c2, B:623:0x00dc, B:624:0x00eb, B:628:0x00f8, B:630:0x00fe, B:685:0x020a, B:687:0x0210, B:688:0x0213, B:690:0x0219, B:692:0x021d, B:632:0x010c, B:634:0x0113, B:635:0x0123, B:637:0x0133, B:641:0x0142, B:642:0x0144, B:645:0x014a, B:647:0x014e, B:649:0x0158, B:651:0x0162, B:653:0x017f, B:654:0x018e, B:655:0x018f, B:656:0x0197, B:657:0x0198, B:659:0x019f, B:661:0x01a7, B:663:0x01af, B:664:0x01b6, B:669:0x01c9, B:671:0x01cf, B:672:0x01d5, B:674:0x01da, B:679:0x01f1, B:683:0x01fc, B:677:0x01e1, B:684:0x01ff, B:698:0x0235, B:700:0x0241, B:701:0x024e, B:703:0x0252, B:709:0x025e, B:711:0x0262, B:713:0x0266, B:724:0x028d, B:726:0x0293, B:728:0x029b, B:730:0x02a5, B:732:0x02ad, B:733:0x02b0, B:734:0x02b5, B:735:0x02b6, B:737:0x02ba, B:739:0x02be, B:743:0x02c6, B:745:0x02ca, B:994:0x0675, B:985:0x0641, B:984:0x063e, B:989:0x0657, B:991:0x0659, B:993:0x0674, B:748:0x02db, B:750:0x02e9, B:753:0x02f0, B:755:0x02f6, B:756:0x0300, B:758:0x0304, B:760:0x030a, B:761:0x030e, B:763:0x0318, B:764:0x0327, B:768:0x0333, B:774:0x0342, B:776:0x0350, B:778:0x0354, B:780:0x0358, B:782:0x0364, B:787:0x036f, B:789:0x0373, B:792:0x0381, B:996:0x067d, B:790:0x037d, B:783:0x0367, B:785:0x036b, B:715:0x026b, B:717:0x0272, B:719:0x027f, B:998:0x0680, B:999:0x0681), top: B:1028:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x01f8 A[LOOP:4: B:624:0x00eb->B:682:0x01f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:812:0x03ca A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0083, TryCatch #18 {CryptoException -> 0x0012, blocks: (B:563:0x0005, B:565:0x0009, B:572:0x0016, B:574:0x001b, B:576:0x0021, B:579:0x0033, B:580:0x0038, B:583:0x0045, B:585:0x0064, B:587:0x0079, B:596:0x0093, B:599:0x0098, B:602:0x009c, B:605:0x00a2, B:594:0x008d, B:833:0x0433, B:835:0x0437, B:837:0x043c, B:840:0x0444, B:842:0x0448, B:844:0x0450, B:846:0x045e, B:849:0x0463, B:851:0x0467, B:855:0x047c, B:856:0x0482, B:964:0x05e2, B:966:0x05f0, B:971:0x05ff, B:972:0x0601, B:974:0x060c, B:977:0x0612, B:979:0x061a, B:980:0x0629, B:982:0x0631, B:794:0x0385, B:797:0x038a, B:799:0x0395, B:802:0x03ae, B:818:0x03f3, B:823:0x0403, B:825:0x0407, B:827:0x040b, B:828:0x0414, B:830:0x041c, B:810:0x03c3, B:812:0x03ca, B:806:0x03ba, B:814:0x03d2, B:816:0x03e8), top: B:1046:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:974:0x060c A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0610, TryCatch #18 {CryptoException -> 0x0012, blocks: (B:563:0x0005, B:565:0x0009, B:572:0x0016, B:574:0x001b, B:576:0x0021, B:579:0x0033, B:580:0x0038, B:583:0x0045, B:585:0x0064, B:587:0x0079, B:596:0x0093, B:599:0x0098, B:602:0x009c, B:605:0x00a2, B:594:0x008d, B:833:0x0433, B:835:0x0437, B:837:0x043c, B:840:0x0444, B:842:0x0448, B:844:0x0450, B:846:0x045e, B:849:0x0463, B:851:0x0467, B:855:0x047c, B:856:0x0482, B:964:0x05e2, B:966:0x05f0, B:971:0x05ff, B:972:0x0601, B:974:0x060c, B:977:0x0612, B:979:0x061a, B:980:0x0629, B:982:0x0631, B:794:0x0385, B:797:0x038a, B:799:0x0395, B:802:0x03ae, B:818:0x03f3, B:823:0x0403, B:825:0x0407, B:827:0x040b, B:828:0x0414, B:830:0x041c, B:810:0x03c3, B:812:0x03ca, B:806:0x03ba, B:814:0x03d2, B:816:0x03e8), top: B:1046:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:979:0x061a A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0610, TryCatch #18 {CryptoException -> 0x0012, blocks: (B:563:0x0005, B:565:0x0009, B:572:0x0016, B:574:0x001b, B:576:0x0021, B:579:0x0033, B:580:0x0038, B:583:0x0045, B:585:0x0064, B:587:0x0079, B:596:0x0093, B:599:0x0098, B:602:0x009c, B:605:0x00a2, B:594:0x008d, B:833:0x0433, B:835:0x0437, B:837:0x043c, B:840:0x0444, B:842:0x0448, B:844:0x0450, B:846:0x045e, B:849:0x0463, B:851:0x0467, B:855:0x047c, B:856:0x0482, B:964:0x05e2, B:966:0x05f0, B:971:0x05ff, B:972:0x0601, B:974:0x060c, B:977:0x0612, B:979:0x061a, B:980:0x0629, B:982:0x0631, B:794:0x0385, B:797:0x038a, B:799:0x0395, B:802:0x03ae, B:818:0x03f3, B:823:0x0403, B:825:0x0407, B:827:0x040b, B:828:0x0414, B:830:0x041c, B:810:0x03c3, B:812:0x03ca, B:806:0x03ba, B:814:0x03d2, B:816:0x03e8), top: B:1046:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:980:0x0629 A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0610, TryCatch #18 {CryptoException -> 0x0012, blocks: (B:563:0x0005, B:565:0x0009, B:572:0x0016, B:574:0x001b, B:576:0x0021, B:579:0x0033, B:580:0x0038, B:583:0x0045, B:585:0x0064, B:587:0x0079, B:596:0x0093, B:599:0x0098, B:602:0x009c, B:605:0x00a2, B:594:0x008d, B:833:0x0433, B:835:0x0437, B:837:0x043c, B:840:0x0444, B:842:0x0448, B:844:0x0450, B:846:0x045e, B:849:0x0463, B:851:0x0467, B:855:0x047c, B:856:0x0482, B:964:0x05e2, B:966:0x05f0, B:971:0x05ff, B:972:0x0601, B:974:0x060c, B:977:0x0612, B:979:0x061a, B:980:0x0629, B:982:0x0631, B:794:0x0385, B:797:0x038a, B:799:0x0395, B:802:0x03ae, B:818:0x03f3, B:823:0x0403, B:825:0x0407, B:827:0x040b, B:828:0x0414, B:830:0x041c, B:810:0x03c3, B:812:0x03ca, B:806:0x03ba, B:814:0x03d2, B:816:0x03e8), top: B:1046:0x0005 }] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [long] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [long] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.f81] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooOO0o(long r30, long r32) {
        /*
            Method dump skipped, instructions count: 1783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f81.OooOO0o(long, long):void");
    }

    public boolean OooOOO() {
        boolean zZze;
        if (this.f18842OoooOOO == null) {
            return false;
        }
        if (OooOO0()) {
            zZze = this.f18827Oooo0;
        } else {
            ba1 ba1Var = this.f18824OooOooO;
            ba1Var.getClass();
            zZze = ba1Var.zze();
        }
        if (zZze || this.f18876o00oO0O >= 0) {
            return true;
        }
        if (this.f18885oo000o == -9223372036854775807L) {
            return false;
        }
        this.f18823OooOoo0.getClass();
        return SystemClock.elapsedRealtime() < this.f18885oo000o;
    }

    public abstract boolean OooOOO0();

    public final int OooOOOO(o0OoOo0 o0oooo0) throws l41 {
        try {
            return Oooo00O(this.f18835Oooo0oO, o0oooo0);
        } catch (i81 e) {
            throw OoooOoo(e, o0oooo0, false, 4002);
        }
    }

    public abstract float OooOOOo(float f, o0OoOo0[] o0oooo0Arr);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:501:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0488 A[Catch: Exception -> 0x0238, TryCatch #1 {Exception -> 0x0238, blocks: (B:556:0x0233, B:555:0x021f, B:561:0x0247, B:568:0x0268, B:571:0x027c, B:573:0x0281, B:578:0x028b, B:580:0x0291, B:583:0x02a3, B:586:0x02b0, B:589:0x02bd, B:590:0x02c5, B:592:0x02c9, B:593:0x02d3, B:596:0x02dd, B:597:0x02f9, B:599:0x02fd, B:601:0x030d, B:602:0x0312, B:604:0x0316, B:605:0x031b, B:608:0x032c, B:610:0x033a, B:611:0x033f, B:613:0x0343, B:614:0x0348, B:616:0x034c, B:617:0x0351, B:619:0x0355, B:620:0x035a, B:622:0x035e, B:623:0x0363, B:625:0x0367, B:626:0x036c, B:628:0x0370, B:629:0x0375, B:631:0x0379, B:632:0x037e, B:634:0x0382, B:635:0x0387, B:637:0x038b, B:638:0x0390, B:640:0x0394, B:641:0x0399, B:643:0x039d, B:644:0x03a2, B:646:0x03a6, B:647:0x03ab, B:649:0x03af, B:650:0x03b4, B:652:0x03b8, B:653:0x03bd, B:655:0x03c1, B:656:0x03c6, B:657:0x03d0, B:659:0x03d3, B:660:0x03dd, B:664:0x040e, B:666:0x041a, B:668:0x0422, B:670:0x042c, B:672:0x0434, B:674:0x043c, B:694:0x0482, B:696:0x0488, B:700:0x0494, B:679:0x044b, B:681:0x0453, B:685:0x045e, B:687:0x0468, B:689:0x0470, B:691:0x0478), top: B:800:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x05c0 A[Catch: d81 -> 0x0083, TryCatch #10 {d81 -> 0x0083, blocks: (B:452:0x0059, B:454:0x005d, B:456:0x0061, B:458:0x0077, B:463:0x0088, B:467:0x0094, B:469:0x009c, B:471:0x00a0, B:473:0x00a4, B:475:0x00ad, B:773:0x059b, B:775:0x05c0, B:777:0x05cc, B:779:0x05e0, B:781:0x05fe, B:784:0x0606, B:785:0x0608, B:780:0x05e3, B:787:0x060b, B:788:0x060c, B:790:0x0611, B:791:0x0612, B:792:0x061f, B:465:0x008b, B:466:0x0093, B:794:0x0621), top: B:817:0x0059, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x05e0 A[Catch: d81 -> 0x0083, TryCatch #10 {d81 -> 0x0083, blocks: (B:452:0x0059, B:454:0x005d, B:456:0x0061, B:458:0x0077, B:463:0x0088, B:467:0x0094, B:469:0x009c, B:471:0x00a0, B:473:0x00a4, B:475:0x00ad, B:773:0x059b, B:775:0x05c0, B:777:0x05cc, B:779:0x05e0, B:781:0x05fe, B:784:0x0606, B:785:0x0608, B:780:0x05e3, B:787:0x060b, B:788:0x060c, B:790:0x0611, B:791:0x0612, B:792:0x061f, B:465:0x008b, B:466:0x0093, B:794:0x0621), top: B:817:0x0059, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x05e3 A[Catch: d81 -> 0x0083, TryCatch #10 {d81 -> 0x0083, blocks: (B:452:0x0059, B:454:0x005d, B:456:0x0061, B:458:0x0077, B:463:0x0088, B:467:0x0094, B:469:0x009c, B:471:0x00a0, B:473:0x00a4, B:475:0x00ad, B:773:0x059b, B:775:0x05c0, B:777:0x05cc, B:779:0x05e0, B:781:0x05fe, B:784:0x0606, B:785:0x0608, B:780:0x05e3, B:787:0x060b, B:788:0x060c, B:790:0x0611, B:791:0x0612, B:792:0x061f, B:465:0x008b, B:466:0x0093, B:794:0x0621), top: B:817:0x0059, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x049a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:831:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r12v11, types: [OooOOo0.o0OOO0o] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.f81, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.nh0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.z71] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.google.android.gms.internal.ads.hk0] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.google.android.gms.internal.ads.o0OoOo0] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOo() throws com.google.android.gms.internal.ads.l41, com.google.android.gms.internal.ads.d81 {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f81.OooOOo():void");
    }

    public b81 OooOOo0(IllegalStateException illegalStateException, c81 c81Var) {
        return new b81(illegalStateException, c81Var);
    }

    public void OooOOoo(long j) {
        this.f18867o00000oo = j;
        while (true) {
            ArrayDeque arrayDeque = this.f18841OoooOO0;
            if (arrayDeque.isEmpty() || j < ((e81) arrayDeque.peek()).f18520OooO00o) {
                return;
            }
            e81 e81Var = (e81) arrayDeque.poll();
            e81Var.getClass();
            OooOoo0(e81Var);
            OoooOO0();
        }
    }

    public final void OooOo() {
        OooOo0o();
        this.f18853Oooooo0 = null;
        this.f18854OoooooO = null;
        this.f18848Ooooo0o = null;
        this.f18849OooooO0 = null;
        this.f18850OooooOO = false;
        this.f18857o00000 = false;
        this.f18851OooooOo = -1.0f;
        this.f18855Ooooooo = 0;
        this.f18883o0OoOo0 = false;
        this.f18887ooOO = false;
        this.f18872o00O0O = false;
        this.f18875o00o0O = false;
        this.f18886oo0o0Oo = false;
        this.f18879o0O0O00 = 0;
    }

    public void OooOo0(o0OoOo0 o0oooo0) {
    }

    public final void OooOo0O() {
        try {
            z71 z71Var = this.f18847Ooooo00;
            if (z71Var != null) {
                z71Var.zzm();
                this.f18869o0000Ooo.f19230OooO0O0++;
                c81 c81Var = this.f18854OoooooO;
                if (c81Var == null) {
                    throw null;
                }
                OoooO0O(c81Var.f17958OooO00o);
            }
            this.f18847Ooooo00 = null;
            this.f18868o0000O00 = null;
            OooOo();
        } catch (Throwable th) {
            this.f18847Ooooo00 = null;
            this.f18868o0000O00 = null;
            OooOo();
            throw th;
        }
    }

    public void OooOo0o() {
        this.f18877o00oO0o = -1;
        this.f18839OoooO00.f17682OooO0o0 = null;
        this.f18876o00oO0O = -1;
        this.f18884o0ooOO0 = null;
        this.f18885oo000o = -9223372036854775807L;
        this.f18860o000000o = false;
        this.f18878o00ooo = -9223372036854775807L;
        this.f18859o000000O = false;
        this.f18873o00Oo0 = false;
        this.f18874o00Ooo = false;
        this.o0ooOOo = false;
        this.o0ooOoO = false;
        this.f18862o00000O0 = -9223372036854775807L;
        this.f18861o00000O = -9223372036854775807L;
        this.f18867o00000oo = -9223372036854775807L;
        this.f18871o000OOo = 0;
        this.f18858o000000 = 0;
        this.f18879o0O0O00 = this.f18886oo0o0Oo ? 1 : 0;
    }

    public boolean OooOoO(c81 c81Var) {
        return true;
    }

    public final boolean OooOoO0() {
        if (this.f18847Ooooo00 == null) {
            return false;
        }
        int i = this.f18858o000000;
        if (i == 3 || ((this.f18883o0OoOo0 && !this.f18857o00000) || (this.f18887ooOO && this.f18860o000000o))) {
            OooOo0O();
            return true;
        }
        if (i == 2) {
            int i2 = i80.f19994OooO00o;
            af0.OooooO0(i2 >= 23);
            if (i2 >= 23) {
                try {
                    pd0 pd0Var = this.f18870o0000oo;
                    pd0Var.getClass();
                    this.f18868o0000O00 = pd0Var;
                    this.f18871o000OOo = 0;
                    this.f18858o000000 = 0;
                } catch (l41 e) {
                    AbstractC1641hg.OooOOoo("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    OooOo0O();
                    return true;
                }
            }
        }
        Oooo0oO();
        return false;
    }

    public boolean OooOoOO(c41 c41Var) {
        return false;
    }

    public final boolean OooOoo() {
        if (this.f18859o000000O) {
            this.f18871o000OOo = 1;
            if (this.f18887ooOO) {
                this.f18858o000000 = 3;
                return false;
            }
            this.f18858o000000 = 2;
            return true;
        }
        pd0 pd0Var = this.f18870o0000oo;
        pd0Var.getClass();
        this.f18868o0000O00 = pd0Var;
        this.f18871o000OOo = 0;
        this.f18858o000000 = 0;
        return true;
    }

    public final void OooOoo0(e81 e81Var) {
        this.f18866o00000oO = e81Var;
        if (e81Var.f18522OooO0OO != -9223372036854775807L) {
            this.f18856o0000 = true;
        }
    }

    public final boolean OooOooO(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        o0OoOo0 o0oooo0 = this.f18843OoooOOo;
        return o0oooo0 == null || !Objects.equals(o0oooo0.f22222OooOOO0, "audio/opus") || j - j2 > 80000;
    }

    public final boolean OooOooo(int i) throws l41, d81 {
        c41 c41Var = this.f18826Oooo;
        dx0 dx0Var = this.f18816OooOo;
        dx0Var.f18417OooOo = null;
        dx0Var.f18419OooOo0o = null;
        c41Var.OooO0Oo();
        int iOoooOoO = OoooOoO(dx0Var, c41Var, i | 4);
        if (iOoooOoO == -5) {
            Oooo0(dx0Var);
            return true;
        }
        if (iOoooOoO != -4 || !c41Var.OooO00o(4)) {
            return false;
        }
        this.f18863o00000OO = true;
        Oooo0oo();
        return false;
    }

    public abstract void Oooo(c41 c41Var);

    /* JADX WARN: Removed duplicated region for block: B:119:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.h41 Oooo0(com.google.android.gms.internal.ads.dx0 r13) throws com.google.android.gms.internal.ads.l41, com.google.android.gms.internal.ads.d81 {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f81.Oooo0(com.google.android.gms.internal.ads.dx0):com.google.android.gms.internal.ads.h41");
    }

    public final boolean Oooo000(o0OoOo0 o0oooo0) throws l41, d81 {
        if (i80.f19994OooO00o >= 23 && this.f18847Ooooo00 != null && this.f18858o000000 != 3 && this.f18822OooOoo != 0) {
            float f = this.f18846OoooOoo;
            o0oooo0.getClass();
            o0OoOo0[] o0oooo0Arr = this.f18825OooOooo;
            o0oooo0Arr.getClass();
            float fOooOOOo = OooOOOo(f, o0oooo0Arr);
            float f2 = this.f18851OooooOo;
            if (f2 != fOooOOOo) {
                if (fOooOOOo == -1.0f) {
                    Oooo0OO();
                    return false;
                }
                if (f2 != -1.0f || fOooOOOo > this.f18836Oooo0oo) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fOooOOOo);
                    z71 z71Var = this.f18847Ooooo00;
                    z71Var.getClass();
                    z71Var.OooOOO0(bundle);
                    this.f18851OooooOo = fOooOOOo;
                }
            }
        }
        return true;
    }

    public abstract int Oooo00O(o0O o0o, o0OoOo0 o0oooo0);

    public abstract h41 Oooo00o(c81 c81Var, o0OoOo0 o0oooo0, o0OoOo0 o0oooo02);

    public final void Oooo0O0() {
        this.f18880o0OO00O = false;
        this.f18840OoooO0O.OooO0Oo();
        this.f18838OoooO0.OooO0Oo();
        this.f18882o0Oo0oo = false;
        this.f18881o0OOO0o = false;
        o0O00O o0o00o = this.o000oOoO;
        o0o00o.getClass();
        o0o00o.f21878OooOo = InterfaceC1723jp.f20345OooO00o;
        o0o00o.f21880OooOo0o = 0;
        o0o00o.f21879OooOo0O = 2;
    }

    public final void Oooo0OO() throws l41, d81 {
        if (this.f18859o000000O) {
            this.f18871o000OOo = 1;
            this.f18858o000000 = 3;
        } else {
            OooOo0O();
            OooOOo();
        }
    }

    public abstract ArrayList Oooo0o(o0O o0o, o0OoOo0 o0oooo0);

    public abstract OooOOo0.o0OOO0o Oooo0o0(c81 c81Var, o0OoOo0 o0oooo0, float f);

    public final void Oooo0oO() {
        try {
            z71 z71Var = this.f18847Ooooo00;
            af0.OooOo0O(z71Var);
            z71Var.zzj();
        } finally {
            OooOo0o();
        }
    }

    public final void Oooo0oo() throws l41, d81 {
        int i = this.f18858o000000;
        if (i == 1) {
            Oooo0oO();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f18864o00000Oo = true;
                o000oOoO();
                return;
            } else {
                OooOo0O();
                OooOOo();
                return;
            }
        }
        Oooo0oO();
        pd0 pd0Var = this.f18870o0000oo;
        pd0Var.getClass();
        this.f18868o0000O00 = pd0Var;
        this.f18871o000OOo = 0;
        this.f18858o000000 = 0;
    }

    public abstract void OoooO(o0OoOo0 o0oooo0, MediaFormat mediaFormat);

    public abstract void OoooO0(long j, long j2, String str);

    public abstract void OoooO00(Exception exc);

    public abstract void OoooO0O(String str);

    public abstract void OoooOO0();

    public abstract boolean OoooOOO(long j, long j2, z71 z71Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, o0OoOo0 o0oooo0);

    public boolean OoooOOo(o0OoOo0 o0oooo0) {
        return false;
    }

    public final int OoooOoO(dx0 dx0Var, c41 c41Var, int i) {
        ba1 ba1Var = this.f18824OooOooO;
        ba1Var.getClass();
        int iOooO0O0 = ba1Var.OooO0O0(dx0Var, c41Var, i);
        if (iOooO0O0 == -4) {
            if (c41Var.OooO00o(4)) {
                this.f18830Oooo00o = Long.MIN_VALUE;
                return this.f18827Oooo0 ? -4 : -3;
            }
            long j = c41Var.f17683OooO0oO + this.f18828Oooo000;
            c41Var.f17683OooO0oO = j;
            this.f18830Oooo00o = Math.max(this.f18830Oooo00o, j);
            return iOooO0O0;
        }
        if (iOooO0O0 == -5) {
            o0OoOo0 o0oooo0 = (o0OoOo0) dx0Var.f18419OooOo0o;
            o0oooo0.getClass();
            long j2 = o0oooo0.f22225OooOOo;
            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                jb1 jb1Var = new jb1(o0oooo0);
                jb1Var.f20256OooOOo0 = j2 + this.f18828Oooo000;
                dx0Var.f18419OooOo0o = new o0OoOo0(jb1Var);
                return -5;
            }
        }
        return iOooO0O0;
    }

    public final l41 OoooOoo(Exception exc, o0OoOo0 o0oooo0, boolean z, int i) {
        int iOooOOOO;
        if (o0oooo0 == null || this.f18831Oooo0O0) {
            iOooOOOO = 4;
        } else {
            this.f18831Oooo0O0 = true;
            try {
                iOooOOOO = OooOOOO(o0oooo0) & 7;
            } catch (l41 unused) {
            } finally {
                this.f18831Oooo0O0 = false;
            }
        }
        return new l41(1, exc, i, OooOO0O(), this.f18819OooOoO, o0oooo0, o0oooo0 == null ? 4 : iOooOOOO, z);
    }

    public final k50 Ooooo00() {
        k50 k50Var = this.f18823OooOoo0;
        k50Var.getClass();
        return k50Var;
    }

    public g51 Ooooo0o() {
        return null;
    }

    public final void OooooO0() {
        this.f18820OooOoO0.getClass();
    }

    public final void OooooOO() {
        synchronized (this.f18817OooOo0O) {
            this.f18834Oooo0o0 = null;
        }
    }

    public abstract void Oooooo(boolean z, boolean z2);

    public void Oooooo0() {
        this.f18842OoooOOO = null;
        OooOoo0(e81.f18519OooO0o0);
        this.f18841OoooOO0.clear();
        OooOoO0();
    }

    public void OoooooO(long j, boolean z) throws l41, d81 {
        this.f18863o00000OO = false;
        this.f18864o00000Oo = false;
        if (this.f18881o0OOO0o) {
            this.f18840OoooO0O.OooO0Oo();
            this.f18838OoooO0.OooO0Oo();
            this.f18882o0Oo0oo = false;
            o0O00O o0o00o = this.o000oOoO;
            o0o00o.getClass();
            o0o00o.f21878OooOo = InterfaceC1723jp.f20345OooO00o;
            o0o00o.f21880OooOo0o = 0;
            o0o00o.f21879OooOo0O = 2;
        } else if (OooOoO0()) {
            OooOOo();
        }
        o0O0OOO0 o0o0ooo0 = this.f18866o00000oO.f18523OooO0Oo;
        if (o0o0ooo0.OooO00o() > 0) {
            this.f18865o00000o0 = true;
        }
        o0o0ooo0.OooO0o();
        this.f18841OoooOO0.clear();
    }

    public void o000oOoO() {
    }

    public void OooOo00() {
    }

    public void OoooOo0() {
    }

    public void OooooOo() {
    }
}
