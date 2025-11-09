package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class oO00O0o implements ooo0Oo0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final XmlPullParserFactory f22455OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final Pattern f22448OooOo0o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Pattern f22447OooOo = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final Pattern f22450OooOoO0 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final Pattern f22449OooOoO = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final Pattern f22451OooOoOO = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final Pattern f22453OooOoo0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final Pattern f22452OooOoo = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final oO00O0o0 f22454OooOooO = new oO00O0o0(30.0f, 1, 1);

    public oO00O0o() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f22455OooOo0O = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long OooO0O0(java.lang.String r13, com.google.android.gms.internal.ads.oO00O0o0 r14) throws com.google.android.gms.internal.ads.oO0Oo, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO00O0o.OooO0O0(java.lang.String, com.google.android.gms.internal.ads.oO00O0o0):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Layout.Alignment OooO0Oo(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.xh0.OooOOo0(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO00O0o.OooO0Oo(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0438 A[Catch: oO0Oo -> 0x0480, TryCatch #1 {oO0Oo -> 0x0480, blocks: (B:231:0x03b0, B:234:0x03c2, B:237:0x03d4, B:240:0x03dc, B:242:0x03e2, B:263:0x0418, B:268:0x043a, B:270:0x0440, B:271:0x0448, B:264:0x041b, B:265:0x0434, B:266:0x0435, B:267:0x0438, B:272:0x0449, B:273:0x044a, B:274:0x0463, B:236:0x03c9, B:275:0x0464, B:276:0x047f), top: B:294:0x03b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0440 A[Catch: oO0Oo -> 0x0480, TryCatch #1 {oO0Oo -> 0x0480, blocks: (B:231:0x03b0, B:234:0x03c2, B:237:0x03d4, B:240:0x03dc, B:242:0x03e2, B:263:0x0418, B:268:0x043a, B:270:0x0440, B:271:0x0448, B:264:0x041b, B:265:0x0434, B:266:0x0435, B:267:0x0438, B:272:0x0449, B:273:0x044a, B:274:0x0463, B:236:0x03c9, B:275:0x0464, B:276:0x047f), top: B:294:0x03b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.oO00O0oO OooO0o(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.oO00O0oO r18) throws com.google.android.gms.internal.ads.oO0Oo {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO00O0o.OooO0o(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.oO00O0oO):com.google.android.gms.internal.ads.oO00O0oO");
    }

    public static oO00O0oO OooO0o0(oO00O0oO oo00o0oo) {
        return oo00o0oo == null ? new oO00O0oO() : oo00o0oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d0 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:22:0x009a, B:25:0x00a6, B:29:0x00ba, B:31:0x00d3, B:33:0x00df, B:34:0x00e3, B:36:0x00ef, B:39:0x00f9, B:74:0x019b, B:92:0x01f6, B:95:0x0206, B:97:0x020c, B:99:0x0214, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0234, B:109:0x023a, B:111:0x0242, B:113:0x024a, B:115:0x0250, B:117:0x0256, B:119:0x025c, B:121:0x0264, B:124:0x026d, B:423:0x0771, B:128:0x029c, B:131:0x02a4, B:133:0x02ad, B:135:0x02be, B:137:0x02c8, B:139:0x02d8, B:141:0x02de, B:143:0x02f4, B:145:0x02fa, B:284:0x052e, B:138:0x02cf, B:148:0x0307, B:151:0x0315, B:153:0x031b, B:155:0x0324, B:157:0x032a, B:158:0x0331, B:161:0x0338, B:283:0x0527, B:164:0x0348, B:166:0x0350, B:170:0x036d, B:172:0x0373, B:174:0x0380, B:192:0x03ca, B:194:0x03d0, B:198:0x03e1, B:200:0x03e7, B:202:0x03f4, B:219:0x043c, B:221:0x0444, B:241:0x0489, B:243:0x0493, B:269:0x04d9, B:204:0x03ff, B:205:0x0400, B:206:0x0401, B:207:0x0409, B:210:0x0411, B:213:0x041b, B:215:0x0421, B:217:0x042c, B:271:0x04e5, B:272:0x04e6, B:273:0x04e7, B:274:0x04f0, B:275:0x04fb, B:176:0x0389, B:177:0x038a, B:178:0x038b, B:180:0x0396, B:183:0x03a0, B:186:0x03a9, B:188:0x03af, B:190:0x03ba, B:277:0x0502, B:278:0x0503, B:279:0x0504, B:280:0x050d, B:281:0x0518, B:289:0x0557, B:292:0x0579, B:356:0x065f, B:326:0x05ea, B:328:0x05f2, B:333:0x060a, B:336:0x0613, B:339:0x061e, B:341:0x062d, B:394:0x06e1, B:340:0x0623, B:351:0x0644, B:354:0x064b, B:355:0x0655, B:361:0x0678, B:365:0x0684, B:369:0x068d, B:377:0x069f, B:380:0x06a8, B:384:0x06b3, B:386:0x06bf, B:388:0x06c4, B:390:0x06c8, B:391:0x06cf, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d6, B:88:0x01d7, B:89:0x01d8, B:44:0x0115, B:47:0x0125, B:50:0x012f, B:52:0x0135, B:54:0x013c, B:56:0x0142, B:62:0x015a, B:64:0x0161, B:73:0x0192, B:69:0x0185, B:72:0x0191, B:398:0x0706, B:400:0x0712, B:401:0x0719, B:404:0x0726, B:407:0x072a, B:409:0x0734, B:411:0x073e, B:415:0x074a, B:413:0x0745, B:418:0x075e, B:421:0x076d, B:428:0x078e), top: B:458:0x0007, inners: #2, #4, #5, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0444 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:22:0x009a, B:25:0x00a6, B:29:0x00ba, B:31:0x00d3, B:33:0x00df, B:34:0x00e3, B:36:0x00ef, B:39:0x00f9, B:74:0x019b, B:92:0x01f6, B:95:0x0206, B:97:0x020c, B:99:0x0214, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0234, B:109:0x023a, B:111:0x0242, B:113:0x024a, B:115:0x0250, B:117:0x0256, B:119:0x025c, B:121:0x0264, B:124:0x026d, B:423:0x0771, B:128:0x029c, B:131:0x02a4, B:133:0x02ad, B:135:0x02be, B:137:0x02c8, B:139:0x02d8, B:141:0x02de, B:143:0x02f4, B:145:0x02fa, B:284:0x052e, B:138:0x02cf, B:148:0x0307, B:151:0x0315, B:153:0x031b, B:155:0x0324, B:157:0x032a, B:158:0x0331, B:161:0x0338, B:283:0x0527, B:164:0x0348, B:166:0x0350, B:170:0x036d, B:172:0x0373, B:174:0x0380, B:192:0x03ca, B:194:0x03d0, B:198:0x03e1, B:200:0x03e7, B:202:0x03f4, B:219:0x043c, B:221:0x0444, B:241:0x0489, B:243:0x0493, B:269:0x04d9, B:204:0x03ff, B:205:0x0400, B:206:0x0401, B:207:0x0409, B:210:0x0411, B:213:0x041b, B:215:0x0421, B:217:0x042c, B:271:0x04e5, B:272:0x04e6, B:273:0x04e7, B:274:0x04f0, B:275:0x04fb, B:176:0x0389, B:177:0x038a, B:178:0x038b, B:180:0x0396, B:183:0x03a0, B:186:0x03a9, B:188:0x03af, B:190:0x03ba, B:277:0x0502, B:278:0x0503, B:279:0x0504, B:280:0x050d, B:281:0x0518, B:289:0x0557, B:292:0x0579, B:356:0x065f, B:326:0x05ea, B:328:0x05f2, B:333:0x060a, B:336:0x0613, B:339:0x061e, B:341:0x062d, B:394:0x06e1, B:340:0x0623, B:351:0x0644, B:354:0x064b, B:355:0x0655, B:361:0x0678, B:365:0x0684, B:369:0x068d, B:377:0x069f, B:380:0x06a8, B:384:0x06b3, B:386:0x06bf, B:388:0x06c4, B:390:0x06c8, B:391:0x06cf, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d6, B:88:0x01d7, B:89:0x01d8, B:44:0x0115, B:47:0x0125, B:50:0x012f, B:52:0x0135, B:54:0x013c, B:56:0x0142, B:62:0x015a, B:64:0x0161, B:73:0x0192, B:69:0x0185, B:72:0x0191, B:398:0x0706, B:400:0x0712, B:401:0x0719, B:404:0x0726, B:407:0x072a, B:409:0x0734, B:411:0x073e, B:415:0x074a, B:413:0x0745, B:418:0x075e, B:421:0x076d, B:428:0x078e), top: B:458:0x0007, inners: #2, #4, #5, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0493 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:22:0x009a, B:25:0x00a6, B:29:0x00ba, B:31:0x00d3, B:33:0x00df, B:34:0x00e3, B:36:0x00ef, B:39:0x00f9, B:74:0x019b, B:92:0x01f6, B:95:0x0206, B:97:0x020c, B:99:0x0214, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0234, B:109:0x023a, B:111:0x0242, B:113:0x024a, B:115:0x0250, B:117:0x0256, B:119:0x025c, B:121:0x0264, B:124:0x026d, B:423:0x0771, B:128:0x029c, B:131:0x02a4, B:133:0x02ad, B:135:0x02be, B:137:0x02c8, B:139:0x02d8, B:141:0x02de, B:143:0x02f4, B:145:0x02fa, B:284:0x052e, B:138:0x02cf, B:148:0x0307, B:151:0x0315, B:153:0x031b, B:155:0x0324, B:157:0x032a, B:158:0x0331, B:161:0x0338, B:283:0x0527, B:164:0x0348, B:166:0x0350, B:170:0x036d, B:172:0x0373, B:174:0x0380, B:192:0x03ca, B:194:0x03d0, B:198:0x03e1, B:200:0x03e7, B:202:0x03f4, B:219:0x043c, B:221:0x0444, B:241:0x0489, B:243:0x0493, B:269:0x04d9, B:204:0x03ff, B:205:0x0400, B:206:0x0401, B:207:0x0409, B:210:0x0411, B:213:0x041b, B:215:0x0421, B:217:0x042c, B:271:0x04e5, B:272:0x04e6, B:273:0x04e7, B:274:0x04f0, B:275:0x04fb, B:176:0x0389, B:177:0x038a, B:178:0x038b, B:180:0x0396, B:183:0x03a0, B:186:0x03a9, B:188:0x03af, B:190:0x03ba, B:277:0x0502, B:278:0x0503, B:279:0x0504, B:280:0x050d, B:281:0x0518, B:289:0x0557, B:292:0x0579, B:356:0x065f, B:326:0x05ea, B:328:0x05f2, B:333:0x060a, B:336:0x0613, B:339:0x061e, B:341:0x062d, B:394:0x06e1, B:340:0x0623, B:351:0x0644, B:354:0x064b, B:355:0x0655, B:361:0x0678, B:365:0x0684, B:369:0x068d, B:377:0x069f, B:380:0x06a8, B:384:0x06b3, B:386:0x06bf, B:388:0x06c4, B:390:0x06c8, B:391:0x06cf, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d6, B:88:0x01d7, B:89:0x01d8, B:44:0x0115, B:47:0x0125, B:50:0x012f, B:52:0x0135, B:54:0x013c, B:56:0x0142, B:62:0x015a, B:64:0x0161, B:73:0x0192, B:69:0x0185, B:72:0x0191, B:398:0x0706, B:400:0x0712, B:401:0x0719, B:404:0x0726, B:407:0x072a, B:409:0x0734, B:411:0x073e, B:415:0x074a, B:413:0x0745, B:418:0x075e, B:421:0x076d, B:428:0x078e), top: B:458:0x0007, inners: #2, #4, #5, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fb A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:22:0x009a, B:25:0x00a6, B:29:0x00ba, B:31:0x00d3, B:33:0x00df, B:34:0x00e3, B:36:0x00ef, B:39:0x00f9, B:74:0x019b, B:92:0x01f6, B:95:0x0206, B:97:0x020c, B:99:0x0214, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0234, B:109:0x023a, B:111:0x0242, B:113:0x024a, B:115:0x0250, B:117:0x0256, B:119:0x025c, B:121:0x0264, B:124:0x026d, B:423:0x0771, B:128:0x029c, B:131:0x02a4, B:133:0x02ad, B:135:0x02be, B:137:0x02c8, B:139:0x02d8, B:141:0x02de, B:143:0x02f4, B:145:0x02fa, B:284:0x052e, B:138:0x02cf, B:148:0x0307, B:151:0x0315, B:153:0x031b, B:155:0x0324, B:157:0x032a, B:158:0x0331, B:161:0x0338, B:283:0x0527, B:164:0x0348, B:166:0x0350, B:170:0x036d, B:172:0x0373, B:174:0x0380, B:192:0x03ca, B:194:0x03d0, B:198:0x03e1, B:200:0x03e7, B:202:0x03f4, B:219:0x043c, B:221:0x0444, B:241:0x0489, B:243:0x0493, B:269:0x04d9, B:204:0x03ff, B:205:0x0400, B:206:0x0401, B:207:0x0409, B:210:0x0411, B:213:0x041b, B:215:0x0421, B:217:0x042c, B:271:0x04e5, B:272:0x04e6, B:273:0x04e7, B:274:0x04f0, B:275:0x04fb, B:176:0x0389, B:177:0x038a, B:178:0x038b, B:180:0x0396, B:183:0x03a0, B:186:0x03a9, B:188:0x03af, B:190:0x03ba, B:277:0x0502, B:278:0x0503, B:279:0x0504, B:280:0x050d, B:281:0x0518, B:289:0x0557, B:292:0x0579, B:356:0x065f, B:326:0x05ea, B:328:0x05f2, B:333:0x060a, B:336:0x0613, B:339:0x061e, B:341:0x062d, B:394:0x06e1, B:340:0x0623, B:351:0x0644, B:354:0x064b, B:355:0x0655, B:361:0x0678, B:365:0x0684, B:369:0x068d, B:377:0x069f, B:380:0x06a8, B:384:0x06b3, B:386:0x06bf, B:388:0x06c4, B:390:0x06c8, B:391:0x06cf, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d6, B:88:0x01d7, B:89:0x01d8, B:44:0x0115, B:47:0x0125, B:50:0x012f, B:52:0x0135, B:54:0x013c, B:56:0x0142, B:62:0x015a, B:64:0x0161, B:73:0x0192, B:69:0x0185, B:72:0x0191, B:398:0x0706, B:400:0x0712, B:401:0x0719, B:404:0x0726, B:407:0x072a, B:409:0x0734, B:411:0x073e, B:415:0x074a, B:413:0x0745, B:418:0x075e, B:421:0x076d, B:428:0x078e), top: B:458:0x0007, inners: #2, #4, #5, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x053b A[LOOP:1: B:131:0x02a4->B:287:0x053b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05d5 A[PHI: r2
  0x05d5: PHI (r2v23 java.lang.Object) = 
  (r2v14 java.lang.Object)
  (r2v15 java.lang.Object)
  (r2v16 java.lang.Object)
  (r2v17 java.lang.Object)
  (r2v18 java.lang.Object)
  (r2v24 java.lang.Object)
 binds: [B:312:0x05d1, B:309:0x05c7, B:306:0x05bb, B:303:0x05af, B:300:0x05a3, B:295:0x058e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06c4 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, oO0Oo -> 0x06e0, TryCatch #1 {oO0Oo -> 0x06e0, blocks: (B:386:0x06bf, B:388:0x06c4, B:390:0x06c8, B:391:0x06cf), top: B:436:0x06bf }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:22:0x009a, B:25:0x00a6, B:29:0x00ba, B:31:0x00d3, B:33:0x00df, B:34:0x00e3, B:36:0x00ef, B:39:0x00f9, B:74:0x019b, B:92:0x01f6, B:95:0x0206, B:97:0x020c, B:99:0x0214, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0234, B:109:0x023a, B:111:0x0242, B:113:0x024a, B:115:0x0250, B:117:0x0256, B:119:0x025c, B:121:0x0264, B:124:0x026d, B:423:0x0771, B:128:0x029c, B:131:0x02a4, B:133:0x02ad, B:135:0x02be, B:137:0x02c8, B:139:0x02d8, B:141:0x02de, B:143:0x02f4, B:145:0x02fa, B:284:0x052e, B:138:0x02cf, B:148:0x0307, B:151:0x0315, B:153:0x031b, B:155:0x0324, B:157:0x032a, B:158:0x0331, B:161:0x0338, B:283:0x0527, B:164:0x0348, B:166:0x0350, B:170:0x036d, B:172:0x0373, B:174:0x0380, B:192:0x03ca, B:194:0x03d0, B:198:0x03e1, B:200:0x03e7, B:202:0x03f4, B:219:0x043c, B:221:0x0444, B:241:0x0489, B:243:0x0493, B:269:0x04d9, B:204:0x03ff, B:205:0x0400, B:206:0x0401, B:207:0x0409, B:210:0x0411, B:213:0x041b, B:215:0x0421, B:217:0x042c, B:271:0x04e5, B:272:0x04e6, B:273:0x04e7, B:274:0x04f0, B:275:0x04fb, B:176:0x0389, B:177:0x038a, B:178:0x038b, B:180:0x0396, B:183:0x03a0, B:186:0x03a9, B:188:0x03af, B:190:0x03ba, B:277:0x0502, B:278:0x0503, B:279:0x0504, B:280:0x050d, B:281:0x0518, B:289:0x0557, B:292:0x0579, B:356:0x065f, B:326:0x05ea, B:328:0x05f2, B:333:0x060a, B:336:0x0613, B:339:0x061e, B:341:0x062d, B:394:0x06e1, B:340:0x0623, B:351:0x0644, B:354:0x064b, B:355:0x0655, B:361:0x0678, B:365:0x0684, B:369:0x068d, B:377:0x069f, B:380:0x06a8, B:384:0x06b3, B:386:0x06bf, B:388:0x06c4, B:390:0x06c8, B:391:0x06cf, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d6, B:88:0x01d7, B:89:0x01d8, B:44:0x0115, B:47:0x0125, B:50:0x012f, B:52:0x0135, B:54:0x013c, B:56:0x0142, B:62:0x015a, B:64:0x0161, B:73:0x0192, B:69:0x0185, B:72:0x0191, B:398:0x0706, B:400:0x0712, B:401:0x0719, B:404:0x0726, B:407:0x072a, B:409:0x0734, B:411:0x073e, B:415:0x074a, B:413:0x0745, B:418:0x075e, B:421:0x076d, B:428:0x078e), top: B:458:0x0007, inners: #2, #4, #5, #11, #16 }] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.google.android.gms.internal.ads.oO00O0oO, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OooOOo0.o0OOO0o OooO00o(byte[] r47, int r48, int r49) throws org.xmlpull.v1.XmlPullParserException, com.google.android.gms.internal.ads.oO0Oo, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO00O0o.OooO00o(byte[], int, int):OooOOo0.o0OOO0o");
    }

    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    public final void OooO0OO(int i, int i2, OooOOOO.OooO0O0 oooO0O0, byte[] bArr) {
        ze0.OooOO0o(OooO00o(bArr, i, i2), oooO0O0);
    }
}
