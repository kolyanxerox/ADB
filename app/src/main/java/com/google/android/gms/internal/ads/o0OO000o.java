package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0OO000o implements o00000O, o000O00 {

    /* renamed from: OooO */
    public final ArrayList f22050OooO;

    /* renamed from: OooO00o */
    public final o0oo0000 f22051OooO00o;

    /* renamed from: OooO0O0 */
    public final int f22052OooO0O0;

    /* renamed from: OooO0OO */
    public final r40 f22053OooO0OO;

    /* renamed from: OooO0Oo */
    public final r40 f22054OooO0Oo;

    /* renamed from: OooO0o */
    public final r40 f22055OooO0o;

    /* renamed from: OooO0o0 */
    public final r40 f22056OooO0o0;

    /* renamed from: OooO0oO */
    public final ArrayDeque f22057OooO0oO;

    /* renamed from: OooO0oo */
    public final oo0ooO f22058OooO0oo;

    /* renamed from: OooOO0 */
    public gn0 f22059OooOO0;

    /* renamed from: OooOO0O */
    public int f22060OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO */
    public int f22061OooOOO;

    /* renamed from: OooOOO0 */
    public long f22062OooOOO0;

    /* renamed from: OooOOOO */
    public r40 f22063OooOOOO;

    /* renamed from: OooOOOo */
    public int f22064OooOOOo;

    /* renamed from: OooOOo */
    public int f22065OooOOo;

    /* renamed from: OooOOo0 */
    public int f22066OooOOo0;

    /* renamed from: OooOOoo */
    public int f22067OooOOoo;

    /* renamed from: OooOo */
    public long[][] f22068OooOo;
    public boolean OooOo0;

    /* renamed from: OooOo00 */
    public boolean f22069OooOo00;

    /* renamed from: OooOo0O */
    public o0000Ooo f22070OooOo0O;

    /* renamed from: OooOo0o */
    public o0OO000[] f22071OooOo0o;

    /* renamed from: OooOoO */
    public long f22072OooOoO;

    /* renamed from: OooOoO0 */
    public int f22073OooOoO0;

    /* renamed from: OooOoOO */
    public int f22074OooOoOO;

    public o0OO000o() {
        this(o0oo0000.f22278OooOO0O, 16);
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        this.f22057OooO0oO.clear();
        this.f22061OooOOO = 0;
        this.f22064OooOOOo = -1;
        this.f22066OooOOo0 = 0;
        this.f22065OooOOo = 0;
        this.f22067OooOOoo = 0;
        this.f22069OooOo00 = true;
        if (j == 0) {
            if (this.f22060OooOO0O != 3) {
                OooO0oO();
                return;
            }
            oo0ooO oo0ooo = this.f22058OooO0oo;
            oo0ooo.f23036OooO00o.clear();
            oo0ooo.f23037OooO0O0 = 0;
            this.f22050OooO.clear();
            return;
        }
        for (o0OO000 o0oo000 : this.f22071OooOo0o) {
            o0OO0O0 o0oo0o0 = o0oo000.f22046OooO0O0;
            int iOooOO0 = i80.OooOO0(o0oo0o0.f22099OooO0o, j2, false);
            while (true) {
                if (iOooOO0 < 0) {
                    iOooOO0 = -1;
                    break;
                } else if ((o0oo0o0.f22101OooO0oO[iOooOO0] & 1) != 0) {
                    break;
                } else {
                    iOooOO0--;
                }
            }
            if (iOooOO0 == -1) {
                iOooOO0 = o0oo0o0.OooO00o(j2);
            }
            o0oo000.f22049OooO0o0 = iOooOO0;
            o000OO00 o000oo002 = o0oo000.f22048OooO0Oo;
            if (o000oo002 != null) {
                o000oo002.f21712OooO0O0 = false;
                o000oo002.f21713OooO0OO = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        gn0 gn0VarOooOOo0;
        o000OO0O o000oo0oOooO0OO = wz0.OooO0OO(o00000oo2, false, false);
        if (o000oo0oOooO0OO != null) {
            gn0VarOooOOo0 = rm0.OooOOo0(o000oo0oOooO0OO);
        } else {
            pm0 pm0Var = rm0.f23913OooOo0o;
            gn0VarOooOOo0 = gn0.f19388OooOoO;
        }
        this.f22059OooOO0 = gn0VarOooOOo0;
        return o000oo0oOooO0OO == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ec A[EDGE_INSN: B:158:0x00ec->B:150:0x00ec BREAK  A[LOOP:1: B:114:0x0069->B:149:0x00e2], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.o000O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.o000Oo0 OooO0Oo(long r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0OO000o.OooO0Oo(long):com.google.android.gms.internal.ads.o000Oo0");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        if ((this.f22052OooO0O0 & 16) == 0) {
            o0000ooo = new de0(o0000ooo, this.f22051OooO00o);
        }
        this.f22070OooOo0O = o0000ooo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:417:0x0013, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0017, code lost:
    
        if (r8 == r7) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x001b, code lost:
    
        if (r8 == 2) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x001d, code lost:
    
        r3 = r41.f22050OooO;
        r8 = r41.f22058OooO0oo;
        r9 = r8.f23037OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0023, code lost:
    
        if (r9 == 0) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0025, code lost:
    
        if (r9 == r7) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0027, code lost:
    
        r15 = r8.f23036OooO00o;
        r24 = 8;
        r5 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0030, code lost:
    
        if (r9 == 2) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0032, code lost:
    
        r18 = r42.zzf();
        r8 = (int) ((r42.zzd() - r42.zzf()) - r8.f23038OooO0OO);
        r12 = new com.google.android.gms.internal.ads.r40(r8);
        r42.OooOO0O(r12.f23745OooO00o, 0, r8);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0055, code lost:
    
        if (r0 >= r15.size()) goto L799;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0057, code lost:
    
        r8 = (com.google.android.gms.internal.ads.oo0oO0) r15.get(r0);
        r12.OooOO0((int) (r8.f23029OooO00o - r18));
        r12.OooOO0O(r4);
        r13 = r12.OooOOo();
        r14 = java.nio.charset.StandardCharsets.UTF_8;
        r9 = r12.OooO0O0(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0076, code lost:
    
        switch(r9.hashCode()) {
            case -1711564334: goto L444;
            case -1332107749: goto L441;
            case -1251387154: goto L438;
            case -830665521: goto L435;
            case 1760745220: goto L432;
            default: goto L447;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0080, code lost:
    
        if (r9.equals("Super_SlowMotion_BGM") == false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0082, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x008a, code lost:
    
        if (r9.equals("Super_SlowMotion_Deflickering_On") == false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x008c, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0094, code lost:
    
        if (r9.equals("Super_SlowMotion_Data") == false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0096, code lost:
    
        r9 = r7 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x009e, code lost:
    
        if (r9.equals("Super_SlowMotion_Edit_Data") == false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x00a0, code lost:
    
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x00a8, code lost:
    
        if (r9.equals("SlowMotion_Data") == false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x00aa, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x00ac, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x00ae, code lost:
    
        if (r9 == 0) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x00b0, code lost:
    
        if (r9 == r7) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x00b2, code lost:
    
        if (r9 == 2) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x00b4, code lost:
    
        if (r9 == 3) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x00b6, code lost:
    
        if (r9 != r4) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x00b8, code lost:
    
        r10 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x00c2, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Invalid SEF name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x00c3, code lost:
    
        r10 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x00c6, code lost:
    
        r10 = 2817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x00c9, code lost:
    
        r10 = 2816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x00cc, code lost:
    
        r10 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x00cd, code lost:
    
        r8 = r8.f23030OooO0O0 - (r13 + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x00d2, code lost:
    
        if (r10 == 2192) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x00d6, code lost:
    
        if (r10 == 2816) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x00da, code lost:
    
        if (r10 == 2817) goto L805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x00de, code lost:
    
        if (r10 == 2819) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x00e2, code lost:
    
        if (r10 != 2820) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x00ea, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x00eb, code lost:
    
        r10 = new java.util.ArrayList();
        r8 = com.google.android.gms.internal.ads.oo0ooO.f23035OooO0o0.OooO0Oo(r12.OooO0O0(r8, r14));
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x00ff, code lost:
    
        if (r13 >= r8.size()) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0101, code lost:
    
        r9 = com.google.android.gms.internal.ads.oo0ooO.f23034OooO0Oo.OooO0Oo((java.lang.CharSequence) r8.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0111, code lost:
    
        if (r9.size() != 3) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0114, code lost:
    
        r10.add(new com.google.android.gms.internal.ads.o0O0000O(java.lang.Long.parseLong((java.lang.String) r9.get(0)), java.lang.Long.parseLong((java.lang.String) r9.get(r7 == true ? 1 : 0)), (r7 == true ? 1 : 0) << (java.lang.Integer.parseInt((java.lang.String) r9.get(2)) - 1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0140, code lost:
    
        r13 = r13 + (r7 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0142, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0148, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x014e, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x014f, code lost:
    
        r3.add(new com.google.android.gms.internal.ads.o0O000(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0157, code lost:
    
        r0 = r0 + (r7 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x015b, code lost:
    
        r43.f21668OooO00o = 0;
        r0 = r7 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0162, code lost:
    
        r3 = r42.zzd();
        r9 = r8.f23038OooO0OO - 20;
        r10 = new com.google.android.gms.internal.ads.r40(r9);
        r42.OooOO0O(r10.f23745OooO00o, 0, r9);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0178, code lost:
    
        if (r0 >= (r9 / 12)) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x017a, code lost:
    
        r10.OooOO0O(r11);
        r12 = r10.f23745OooO00o;
        r13 = r10.f23746OooO0O0;
        r14 = r13 + 1;
        r10.f23746OooO0O0 = r14;
        r29 = r7;
        r7 = r12[r13] & org.apache.tika.fork.ForkServer.ERROR;
        r10.f23746OooO0O0 = r13 + r11;
        r7 = (short) (r7 | ((r12[r14] & org.apache.tika.fork.ForkServer.ERROR) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0196, code lost:
    
        if (r7 == r5) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x019a, code lost:
    
        if (r7 == 2816) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x019e, code lost:
    
        if (r7 == 2817) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x01a4, code lost:
    
        if (r7 == 2819) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x01a6, code lost:
    
        if (r7 == 2820) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x01a8, code lost:
    
        r10.OooOO0O(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x01bd, code lost:
    
        r15.add(new com.google.android.gms.internal.ads.oo0oO0(r10.OooOOo(), (r3 - r8.f23038OooO0OO) - r10.OooOOo()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x01d7, code lost:
    
        r0 = r0 + 1;
        r7 = r29 == true ? 1 : 0;
        r5 = 2192;
        r11 = 2;
        r24 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x01e1, code lost:
    
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x01e7, code lost:
    
        if (r15.isEmpty() == false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x01e9, code lost:
    
        r43.f21668OooO00o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x01ed, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x01f0, code lost:
    
        r8.f23037OooO0O0 = 3;
        r43.f21668OooO00o = ((com.google.android.gms.internal.ads.oo0oO0) r15.get(0)).f23029OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x01fe, code lost:
    
        r29 = r7 == true ? 1 : 0;
        r3 = new com.google.android.gms.internal.ads.r40(8);
        r42.OooOO0O(r3.f23745OooO00o, 0, 8);
        r8.f23038OooO0OO = r3.OooOOo() + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x021b, code lost:
    
        if (r3.OooOOo0() == 1397048916) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x021d, code lost:
    
        r43.f21668OooO00o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0222, code lost:
    
        r43.f21668OooO00o = r42.zzf() - (r8.f23038OooO0OO - 12);
        r8.f23037OooO0O0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0232, code lost:
    
        r29 = r7 == true ? 1 : 0;
        r3 = r42.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x023a, code lost:
    
        if (r3 == (-1)) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x023e, code lost:
    
        if (r3 >= 8) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0240, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0243, code lost:
    
        r3 = r3 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0246, code lost:
    
        r43.f21668OooO00o = r3;
        r0 = r29;
        r8.f23037OooO0O0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0252, code lost:
    
        if (r43.f21668OooO00o != 0) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0254, code lost:
    
        OooO0oO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0257, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x025b, code lost:
    
        r5 = r42.zzf();
        r7 = r41.f22064OooOOOo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0265, code lost:
    
        if (r7 != (-1)) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0267, code lost:
    
        r9 = -1;
        r10 = -1;
        r11 = 0;
        r12 = true;
        r13 = true;
        r16 = androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL;
        r31 = androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL;
        r33 = androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x027b, code lost:
    
        r14 = r41.f22071OooOo0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0283, code lost:
    
        if (r11 >= r14.length) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0285, code lost:
    
        r7 = r14[r11];
        r8 = r7.f22049OooO0o0;
        r7 = r7.f22046OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x028d, code lost:
    
        if (r8 != r7.f22096OooO0O0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0292, code lost:
    
        r37 = r7.f22097OooO0OO[r8];
        r7 = r41.f22068OooOo;
        r14 = com.google.android.gms.internal.ads.i80.f19994OooO00o;
        r39 = r7[r11][r8];
        r37 = r37 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x02a4, code lost:
    
        if (r37 < 0) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x02a8, code lost:
    
        if (r37 < 262144) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x02aa, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x02ac, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x02ad, code lost:
    
        if (r7 != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x02af, code lost:
    
        if (r12 != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x02b1, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x02b2, code lost:
    
        if (r7 != r12) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x02b6, code lost:
    
        if (r37 >= r33) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x02b8, code lost:
    
        r12 = r7;
        r10 = r11;
        r33 = r37;
        r31 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x02c0, code lost:
    
        if (r39 >= r16) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x02c2, code lost:
    
        r13 = r7;
        r9 = r11;
        r16 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x02c7, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x02cc, code lost:
    
        if (r16 == androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x02ce, code lost:
    
        if (r13 == false) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x02d7, code lost:
    
        if (r31 < (r16 + 10485760)) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x02d9, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x02db, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x02dc, code lost:
    
        r41.f22064OooOOOo = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x02df, code lost:
    
        if (r7 != (-1)) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x02e1, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x02e2, code lost:
    
        r7 = r41.f22071OooOo0o[r7];
        r8 = r7.f22047OooO0OO;
        r9 = r7.f22049OooO0o0;
        r10 = r7.f22046OooO0O0;
        r12 = r10.f22097OooO0OO[r9];
        r11 = r10.f22098OooO0Oo[r9];
        r32 = r4;
        r5 = (r12 - r5) + r41.f22066OooOOo0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0300, code lost:
    
        if (r5 < 0) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0304, code lost:
    
        if (r5 < 262144) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0309, code lost:
    
        r2 = r7.f22045OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x030e, code lost:
    
        if (r2.f22087OooO0oo != 1) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0310, code lost:
    
        r5 = r5 + 8;
        r11 = r11 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0314, code lost:
    
        r42.OooO0O0((int) r5);
        r3 = r2.f22086OooO0oO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0322, code lost:
    
        if (java.util.Objects.equals(r3.f22222OooOOO0, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) != false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0324, code lost:
    
        r4 = 1;
        r41.f22069OooOo00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0328, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0329, code lost:
    
        r2 = r2.f22089OooOO0O;
        r5 = r7.f22048OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x032d, code lost:
    
        if (r2 == 0) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x032f, code lost:
    
        r3 = r41.f22054OooO0Oo;
        r6 = r3.f23745OooO00o;
        r6[0] = 0;
        r6[r4] = 0;
        r6[2] = 0;
        r12 = r2 + 1;
        r4 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0343, code lost:
    
        if (r41.f22065OooOOo >= r11) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0345, code lost:
    
        r2 = r41.f22067OooOOoo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0347, code lost:
    
        if (r2 != 0) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0349, code lost:
    
        r42.OooOO0O(r6, r4, r12);
        r41.f22066OooOOo0 += r12;
        r3.OooOO0(0);
        r2 = r3.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0359, code lost:
    
        if (r2 <= 0) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x035b, code lost:
    
        r41.f22067OooOOoo = r2 - 1;
        r2 = r41.f22053OooO0OO;
        r2.OooOO0(0);
        r13 = r32;
        r8.OooO0Oo(r13, r2);
        r8.OooO0Oo(1, r3);
        r41.f22065OooOOo += 5;
        r11 = r11 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0378, code lost:
    
        if (r41.f22069OooOo00 != false) goto L816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0380, code lost:
    
        if (com.google.android.gms.internal.ads.af0.o0OoOo0(r6[r13]) == false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0382, code lost:
    
        r41.f22069OooOo00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0384, code lost:
    
        r32 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x038e, code lost:
    
        throw com.google.android.gms.internal.ads.C2185w6.OooO00o(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x038f, code lost:
    
        r2 = r8.OooO0OO(r42, r2, false);
        r41.f22066OooOOo0 += r2;
        r41.f22065OooOOo += r2;
        r41.f22067OooOOoo -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x03a4, code lost:
    
        r36 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x03af, code lost:
    
        if ("audio/ac4".equals(r3.f22222OooOOO0) == false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x03b3, code lost:
    
        if (r41.f22065OooOOo != 0) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x03b5, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1641hg.OooO0o0(r11, r15);
        r3 = 7;
        r8.OooO0Oo(7, r15);
        r41.f22065OooOOo += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x03c2, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x03c3, code lost:
    
        r11 = r11 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x03c5, code lost:
    
        if (r5 == null) goto L820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x03c7, code lost:
    
        r5.OooO0OO(r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x03ca, code lost:
    
        r2 = r41.f22065OooOOo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x03cc, code lost:
    
        if (r2 >= r11) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x03ce, code lost:
    
        r2 = r8.OooO0OO(r42, r11 - r2, false);
        r41.f22066OooOOo0 += r2;
        r41.f22065OooOOo += r2;
        r41.f22067OooOOoo -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x03e5, code lost:
    
        r33 = r10.f22099OooO0o[r9];
        r0 = r10.f22101OooO0oO[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x03ef, code lost:
    
        if (r41.f22069OooOo00 != false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x03f1, code lost:
    
        r0 = r0 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x03f4, code lost:
    
        r35 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x03f6, code lost:
    
        if (r5 == null) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x03f8, code lost:
    
        r5.OooO0O0(r8, r33, r35, r36, 0, null);
        r4 = 1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0409, code lost:
    
        if ((r9 + 1) != r10.f22096OooO0O0) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x040b, code lost:
    
        r5.OooO00o(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0410, code lost:
    
        r4 = 1;
        r8.OooO00o(r33, r35, r36, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x041c, code lost:
    
        r7.f22049OooO0o0 += r4;
        r41.f22064OooOOOo = -1;
        r41.f22066OooOOo0 = 0;
        r41.f22065OooOOo = 0;
        r41.f22067OooOOoo = 0;
        r41.f22069OooOo00 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x042d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x042e, code lost:
    
        r43.f21668OooO00o = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0430, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0431, code lost:
    
        r4 = r41.f22062OooOOO0 - r41.f22061OooOOO;
        r6 = r42.zzf() + r4;
        r8 = r41.f22063OooOOOO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x043f, code lost:
    
        if (r8 == null) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0441, code lost:
    
        r42.OooOO0O(r8.f23745OooO00o, r41.f22061OooOOO, (int) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x044e, code lost:
    
        if (r41.OooOO0o != 1718909296) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0450, code lost:
    
        r41.OooOo0 = true;
        r8.OooOO0(8);
        r4 = r8.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0462, code lost:
    
        if (r4 == 1751476579) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0464, code lost:
    
        if (r4 == 1903435808) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0466, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0468, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x046a, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x046b, code lost:
    
        if (r4 == 0) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x046e, code lost:
    
        r8.OooOO0O(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0476, code lost:
    
        if (r8.OooOOOO() <= 0) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0478, code lost:
    
        r4 = r8.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x047c, code lost:
    
        if (r4 == 1751476579) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x047e, code lost:
    
        if (r4 == 1903435808) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0480, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0482, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0484, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0485, code lost:
    
        if (r4 == 0) goto L798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0488, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0489, code lost:
    
        r41.f22074OooOoOO = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x048b, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0491, code lost:
    
        if (r9.isEmpty() != false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0493, code lost:
    
        ((com.google.android.gms.internal.ads.ba0) r9.peek()).f17463OooO0Oo.add(new com.google.android.gms.internal.ads.ia0(r41.OooOO0o, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x04a8, code lost:
    
        if (r41.OooOo0 != false) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x04af, code lost:
    
        if (r41.OooOO0o != 1835295092) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x04b1, code lost:
    
        r41.f22074OooOoOO = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x04b6, code lost:
    
        if (r4 >= 262144) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x04b8, code lost:
    
        r42.OooO0O0((int) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x04bd, code lost:
    
        r43.f21668OooO00o = r42.zzf() + r4;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x04c5, code lost:
    
        OooO0oo(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x04c8, code lost:
    
        if (r10 == false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x04cd, code lost:
    
        if (r41.f22060OooOO0O == 2) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x04cf, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r42, com.google.android.gms.internal.ads.o0000O00 r43) throws com.google.android.gms.internal.ads.C2185w6 {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0OO000o.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    public final void OooO0oO() {
        this.f22060OooOO0O = 0;
        this.f22061OooOOO = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:500:0x017e, code lost:
    
        r6.OooOO0(r7);
        r6.OooOO0O(r12);
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0189, code lost:
    
        r15 = r6.f23746OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x018b, code lost:
    
        if (r15 >= r11) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x018d, code lost:
    
        r15 = r6.OooOOo0() + r15;
        r4 = r6.OooOOo0();
        r29 = r5;
        r5 = (r4 >> 24) & 255;
        r30 = r14;
        r32 = r2;
        r33 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x01b0, code lost:
    
        if (r5 == 169) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x01b4, code lost:
    
        if (r5 != 253) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x01bb, code lost:
    
        if (r4 != 1735291493) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x01bd, code lost:
    
        r3 = com.google.android.gms.internal.ads.o0oOO.OooO00o(com.google.android.gms.internal.ads.af0.OooOOo(r6) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x01c7, code lost:
    
        if (r3 == null) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x01c9, code lost:
    
        r0 = new com.google.android.gms.internal.ads.o0O0o("TCON", null, com.google.android.gms.internal.ads.rm0.OooOOo0(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x01d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x01db, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x01e0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x01e5, code lost:
    
        if (r4 != 1684632427) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x01e7, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.Oooo0OO(1684632427, "TPOS", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x01f1, code lost:
    
        if (r4 != 1953655662) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x01f3, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.Oooo0OO(1953655662, "TRCK", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x01fd, code lost:
    
        if (r4 != 1953329263) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x01ff, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OooOoo0(1953329263, "TBPM", r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x020c, code lost:
    
        if (r4 != 1668311404) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x020e, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OooOoo0(1668311404, "TCMP", r6, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0218, code lost:
    
        if (r4 != 1668249202) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x021a, code lost:
    
        r2 = r6.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0225, code lost:
    
        if (r6.OooOOo0() != 1684108385) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0227, code lost:
    
        r3 = r6.OooOOo0() & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x022f, code lost:
    
        if (r3 != 13) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0231, code lost:
    
        r4 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0236, code lost:
    
        if (r3 != 14) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0238, code lost:
    
        r4 = "image/png";
        r3 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0240, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0241, code lost:
    
        if (r4 != null) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0243, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1641hg.OooOOo0("MetadataUtil", "Unrecognized cover art flags: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0253, code lost:
    
        r6.OooOO0O(4);
        r2 = r2 - 16;
        r0 = new byte[r2];
        r6.OooO0o(r0, 0, r2);
        r0 = new com.google.android.gms.internal.ads.o00OO(r4, null, 3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0269, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse cover art attribute");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0276, code lost:
    
        if (r4 != 1631670868) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0278, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1631670868, "TPE2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0283, code lost:
    
        if (r4 != 1936682605) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0285, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1936682605, "TSOT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0290, code lost:
    
        if (r4 != 1936679276) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0292, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1936679276, "TSOA", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x029d, code lost:
    
        if (r4 != 1936679282) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x029f, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1936679282, "TSOP", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x02aa, code lost:
    
        if (r4 != 1936679265) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x02ac, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1936679265, "TSO2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x02b7, code lost:
    
        if (r4 != 1936679791) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x02b9, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1936679791, "TSOC", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x02c4, code lost:
    
        if (r4 != 1920233063) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x02c6, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OooOoo0(1920233063, "ITUNESADVISORY", r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x02d3, code lost:
    
        if (r4 != 1885823344) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x02d5, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OooOoo0(1885823344, "ITUNESGAPLESS", r6, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x02e1, code lost:
    
        if (r4 != 1936683886) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x02e3, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1936683886, "TVSHOWSORT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x02ee, code lost:
    
        if (r4 != 1953919848) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x02f0, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(1953919848, "TVSHOW", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x02fb, code lost:
    
        if (r4 != 757935405) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x02fd, code lost:
    
        r0 = null;
        r4 = null;
        r2 = r16;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0302, code lost:
    
        r12 = r6.f23746OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0304, code lost:
    
        if (r12 >= r15) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0306, code lost:
    
        r14 = r6.OooOOo0();
        r5 = r6.OooOOo0();
        r31 = r3;
        r6.OooOO0O(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0317, code lost:
    
        if (r5 != 1835360622) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0319, code lost:
    
        r4 = r6.OooO00o(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x031f, code lost:
    
        r3 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0323, code lost:
    
        r3 = r14 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x032a, code lost:
    
        if (r5 != 1851878757) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x032c, code lost:
    
        r0 = r6.OooO00o(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0334, code lost:
    
        if (r5 != 1684108385) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0337, code lost:
    
        r14 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0339, code lost:
    
        if (r5 != 1684108385) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x033b, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x033d, code lost:
    
        r6.OooOO0O(r3);
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0342, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0344, code lost:
    
        if (r4 == null) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0346, code lost:
    
        if (r0 == null) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x034a, code lost:
    
        if (r2 != r16) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x034e, code lost:
    
        r6.OooOO0(r2);
        r6.OooOO0O(16);
        r0 = new com.google.android.gms.internal.ads.o0O00o0(r4, r0, r6.OooO00o(r31 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0369, code lost:
    
        r5 = r4 & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x036e, code lost:
    
        if (r5 != 6516084) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0370, code lost:
    
        r2 = r6.OooOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x037b, code lost:
    
        if (r6.OooOOo0() != 1684108385) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x037d, code lost:
    
        r6.OooOO0O(8);
        r0 = r6.OooO00o(r2 - 16);
        r0 = new com.google.android.gms.internal.ads.o0o0Oo("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0392, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.ta0.OooO0O0(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x039f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x03a8, code lost:
    
        if (r5 == 7233901) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x03ad, code lost:
    
        if (r5 != 7631467) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x03b4, code lost:
    
        if (r5 == 6516589) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x03b9, code lost:
    
        if (r5 != 7828084) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x03c0, code lost:
    
        if (r5 != 6578553) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x03c2, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TDRC", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x03cd, code lost:
    
        if (r5 != 4280916) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x03cf, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TPE1", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x03d9, code lost:
    
        if (r5 != 7630703) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x03db, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TSSE", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x03e5, code lost:
    
        if (r5 != 6384738) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x03e7, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TALB", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x03f1, code lost:
    
        if (r5 != 7108978) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x03f3, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "USLT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x03fd, code lost:
    
        if (r5 != 6776174) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x03ff, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TCON", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0407, code lost:
    
        if (r5 != 6779504) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0409, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TIT1", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0410, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1641hg.OooO0oO("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.ta0.OooO0O0(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0425, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TCOM", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x042c, code lost:
    
        r0 = com.google.android.gms.internal.ads.af0.OoooO0O(r4, "TIT2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0435, code lost:
    
        if (r0 == null) goto L847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0437, code lost:
    
        r7.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x043a, code lost:
    
        r5 = r29;
        r14 = r30;
        r2 = r32;
        r0 = r33;
        r16 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x044c, code lost:
    
        r6.OooOO0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x044f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0450, code lost:
    
        r33 = r0;
        r32 = r2;
        r29 = r5;
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x045f, code lost:
    
        if (r7.isEmpty() == false) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0461, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0463, code lost:
    
        r4 = new com.google.android.gms.internal.ads.C2107u2(r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x07b4 A[LOOP:13: B:793:0x07b1->B:795:0x07b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:799:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x0793 A[EDGE_INSN: B:857:0x0793->B:792:0x0793 BREAK  A[LOOP:10: B:721:0x0638->B:791:0x077e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(long r37) {
        /*
            Method dump skipped, instructions count: 2137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0OO000o.OooO0oo(long):void");
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f22072OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final /* synthetic */ List zzd() {
        return this.f22059OooOO0;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return true;
    }

    public o0OO000o(o0oo0000 o0oo0000Var, int i) {
        this.f22051OooO00o = o0oo0000Var;
        this.f22052OooO0O0 = i;
        pm0 pm0Var = rm0.f23913OooOo0o;
        this.f22059OooOO0 = gn0.f19388OooOoO;
        this.f22060OooOO0O = 0;
        this.f22058OooO0oo = new oo0ooO();
        this.f22050OooO = new ArrayList();
        this.f22055OooO0o = new r40(16);
        this.f22057OooO0oO = new ArrayDeque();
        this.f22053OooO0OO = new r40(af0.f17029OooO0O0);
        this.f22054OooO0Oo = new r40(5);
        this.f22056OooO0o0 = new r40();
        this.f22064OooOOOo = -1;
        this.f22070OooOo0O = o0000Ooo.f21682OooOO0;
        this.f22071OooOo0o = new o0OO000[0];
        this.f22069OooOo00 = true;
    }
}
