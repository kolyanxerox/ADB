package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bj */
/* loaded from: classes2.dex */
public final class C2679bj extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static char[] f5156 = null;

    /* renamed from: ｋ */
    private static int f5157 = 1;

    /* renamed from: ﾇ */
    private static long f5158;

    /* renamed from: ﾒ */
    private static int f5159;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bj$a */
    public class a extends HashMap<String, DTBFetchManager> implements InterfaceC2838hg<HashMap<String, DTBFetchManager>> {

        /* renamed from: ｋ */
        private static int f5183 = 1;

        /* renamed from: ﾇ */
        private static long f5184 = 8917010822505236717L;

        /* renamed from: ﾒ */
        private static int f5185;

        /* renamed from: ﻛ */
        private InterfaceC2704ch f5187;

        public a(HashMap<String, DTBFetchManager> map, InterfaceC2704ch interfaceC2704ch) {
            super(map);
            this.f5187 = interfaceC2704ch;
        }

        /* renamed from: ｋ */
        private HashMap<String, DTBFetchManager> m5560() {
            int i = f5183 + 55;
            f5185 = i % 128;
            if (i % 2 != 0) {
                int i2 = 33 / 0;
            }
            return this;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f5185 = (f5183 + 57) % 128;
            DTBFetchManager dTBFetchManagerM5558 = m5558((String) obj, (DTBFetchManager) obj2);
            f5185 = (f5183 + 7) % 128;
            return dTBFetchManagerM5558;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2838hg
        /* renamed from: ﻛ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo5387() {
            f5185 = (f5183 + 45) % 128;
            HashMap<String, DTBFetchManager> mapM5560 = m5560();
            f5185 = (f5183 + 115) % 128;
            return mapM5560;
        }

        /* renamed from: ﻛ */
        private DTBFetchManager m5558(String str, DTBFetchManager dTBFetchManager) {
            f5183 = (f5185 + 71) % 128;
            C2679bj.this.m5464(this, this.f5187, m5559("ࢩ쥴謵䷌ྼ솘艀䐞ۈ\ud8b9骁孃ᴖ\udfe1醩厅ᑵ협ꣴ檲Ⲥ\ued5d꼃憨⎥\ue59dꙋ", 49612 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i = f5185 + 79;
            f5183 = i % 128;
            if (i % 2 == 0) {
                int i2 = 5 / 0;
            }
            return dTBFetchManager2;
        }

        /* renamed from: ｋ */
        private static String m5559(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2804g.f6422) {
                try {
                    C2804g.f6423 = i;
                    char[] cArr2 = new char[cArr.length];
                    C2804g.f6421 = 0;
                    while (true) {
                        int i2 = C2804g.f6421;
                        if (i2 < cArr.length) {
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5184);
                            C2804g.f6421++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bj$d */
    public class d extends ThreadPoolExecutor implements InterfaceC2838hg<ThreadPoolExecutor>, AutoCloseable {

        /* renamed from: ﻐ */
        private static char[] f5188 = {'2', 'l', 't', 'l', 'd', 'n', 'n', 'I', 'I', 'd', 'f', 'o', 't', 'k', '\\', 'b', 'p', 'q', 't', 'l', 'd', 'n', '^', 'C', 'K'};

        /* renamed from: ｋ */
        private static int f5189 = 1;

        /* renamed from: ﾇ */
        private static int f5190;

        /* renamed from: ﾒ */
        private InterfaceC2704ch f5192;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(ThreadPoolExecutor threadPoolExecutor, InterfaceC2704ch interfaceC2704ch) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f5192 = interfaceC2704ch;
        }

        /* renamed from: ﻐ */
        private ThreadPoolExecutor m5561() {
            int i = f5190;
            int i2 = i + 13;
            f5189 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            int i4 = i + 99;
            f5189 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return this;
        }

        /* renamed from: ｋ */
        private static String m5562(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            byte[] bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            synchronized (C2831h.f6553) {
                try {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    int i4 = iArr[3];
                    char[] cArr = new char[i2];
                    System.arraycopy(f5188, i, cArr, 0, i2);
                    if (bArr != null) {
                        char[] cArr2 = new char[i2];
                        C2831h.f6552 = 0;
                        char c = 0;
                        while (true) {
                            int i5 = C2831h.f6552;
                            if (i5 >= i2) {
                                break;
                            }
                            if (bArr[i5] == 1) {
                                cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                            } else {
                                cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                            }
                            c = cArr2[i5];
                            C2831h.f6552 = i5 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i4 > 0) {
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr, 0, cArr3, 0, i2);
                        int i6 = i2 - i4;
                        System.arraycopy(cArr3, 0, cArr, i6, i4);
                        System.arraycopy(cArr3, i4, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i2];
                        C2831h.f6552 = 0;
                        while (true) {
                            int i7 = C2831h.f6552;
                            if (i7 >= i2) {
                                break;
                            }
                            cArr4[i7] = cArr[(i2 - i7) - 1];
                            C2831h.f6552 = i7 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i3 > 0) {
                        C2831h.f6552 = 0;
                        while (true) {
                            int i8 = C2831h.f6552;
                            if (i8 >= i2) {
                                break;
                            }
                            cArr[i8] = (char) (cArr[i8] - iArr[2]);
                            C2831h.f6552 = i8 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() throws InterruptedException {
            boolean zIsTerminated;
            if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i = f5190 + 31;
            f5189 = i % 128;
            if (i % 2 == 0) {
                C2679bj c2679bj = C2679bj.this;
                InterfaceC2704ch interfaceC2704ch = this.f5192;
                String strIntern = m5562(false, new int[]{0, 25, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000").intern();
                Object[] objArr = new Object[0];
                objArr[0] = runnable;
                c2679bj.m5464(this, interfaceC2704ch, strIntern, objArr);
            } else {
                C2679bj.this.m5464(this, this.f5192, m5562(true, new int[]{0, 25, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000").intern(), runnable);
            }
            super.execute(runnable);
            f5189 = (f5190 + 115) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2838hg
        /* renamed from: ﻛ */
        public final /* synthetic */ ThreadPoolExecutor mo5387() {
            f5189 = (f5190 + 65) % 128;
            ThreadPoolExecutor threadPoolExecutorM5561 = m5561();
            int i = f5189 + 61;
            f5190 = i % 128;
            if (i % 2 == 0) {
                return threadPoolExecutorM5561;
            }
            throw null;
        }
    }

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("KqØ<màò¬\u0006 «n8\u008dM\u008eÑJfå\u008b¬\u001fR¬\u0019¿S,?\u0099Ò\u0006¬òQ_\u0016Ì×¹\u0099%(\u0092â\u007f¼ëXX\u0011ÅÉ÷\u0012dKÑ\u0086NÌº\u0011\u0017O\u0084\u0089ñßmwÚ³7õÕ~F;óâlè\u0098X5\u001d¦ÊÓ\u0098O:øâ\u0015é\u0081Z2\u0014¯ÞØ\u008at9áè\u0012ê\u008e^;\u0012TÚÁÎ}\u001fîÆ\u001b\u0087·} \u0014]ÚÎ\u0088z.\u0097ú\u0000¾¼D\u008b\u000b\u0018R\u00ad\u009f2ÝÆ\u0005kVø\u009c\u008dÂ\u0011t¦ªKüß\u0018lJñ\u009b\u0086Ý*I¿¼LâÐ\u0004eR\n\u0092\u009fÆ#p\u0000\u0007\u0093B&\u009b¹\u0091M!àds³\u0006á\u009aC-\u009bÀ\u0090T#çmz§\ró¡@4\u0091Ç\u0093['îk\u0081£\u0014·¨f;¿Îþb\fõ`\u0088£\u001bý¯SB\u0099ÕÇi-üy\u008f¿\"þ¶LI¨ÜÑp\u000f\u0003e\u0096£)÷½SP\u0091Ì}_$êéu£\u0081y,\u0015¿ìÊ²V\u0018áÞ\f\u008a\u0098n+,\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTGç\tzÃ\r\u0097¡$4õÇ÷[Cî\u000f\u0081Ç\u0014Ó¨\u0002;ÛÎ\u009ab`õ\u000e\u0088ò\u001b\u009f¯1BçÕ¡iIü\u001d\u008fË\u0095Ö\u0006\u008f³B,\bØÒu¶æJ\u0093\u0019\u000f¿¸qU;ÁÅr\u0097ïS\u0098\u00054´¡n\u0012.\u0081w4º«ð_*òKa³\u0014ô\u0088F?\u009eÒÂ\u0000D\u0093\u001d&Ð¹\u009aM@à?sÓ\u0006\u008e\u009a=-ôÀ©TW\u0000D\u0093\u001d&Ð¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\t\u0000D\u0093\u001d&Ð¹\u009aM@à;sß\u0006\u009a\u009a?\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTGç\tzÃ\r\u0097¡$4õÇ÷[Cî\u000f\u0081Ç\u0014Ó¨\u0002;ÛÎ\u009ab`õ\u000e\u0088å\u001b\u0095¯ Bùdñ÷¨BeÝ/)õ\u0084\u008b\u0017jb0þ\u0098u\næSS\u009eÌÔ8\u000e\u0095u\u0006\u0091sÔïqX\u008cµá!\u001d\u0092R\u000f\u0094xÂÔ}A\u009d²û.\u0005\u009b@ô\u0094aÇ\u0000D\u0093\u001d&Ð¹\u009dMAà\u0019sÕ\u0006\u0097\u009a\u000e-ðÀ¹TWç\u0003zÇ\r\u0087=ã®º\u001bw\u0084:pæÝ¾Nr;0§¢\u0010Wý\u0013iåÚ¬Gw0+\u0000D\u0093\u001d&Ð¹\u0089MAà\u0003sÒ\u0006\u009a\u009a:-ôÀ¨\u0000D\u0093\u001d&Ð¹\u009aM@à/s×\u0006\u0091\u009a&-ôÀ¨Toç\u0005zÆ\r\u008a¡\"4þÇ¼[Pì±\u007fèÊ%Uo¡µ\fÚ\u009f\"êyvØÁ&,N¸¸\u000b÷\u0096%áyMþØ\f+_·£\u0002ûm/ømDÁ\u0000D\u0093\u001d&Ð¹\u009aM@à/s×\u0006\u008c\u009a--ØÀ´TWç\tzÇ\r\u008d¡34ùÇ\u00ad[Kî\n\u0081Ø\u0014±¨/;üÎ¬bDõ\u0004\u0088Ö\u001b\u008e\u0000D\u0093\u001d&Ð¹\u009aM@à.s×\u0006\u0093\u009a$-óÀ»T@ç\u0007\u0000D\u0093\u001d&Ð¹\u009aM@à(sÎ\u0006\u008f\u009a)-ÿÀ¾TFç\bzù\r\u0097¡44äÇ¼[Lî\u000e\u0081Æ\u0000D\u0093\u001d&Ð¹\u009aM@à$sØ\u0006\u008b\u009a--ãÀ©TWç\u0005zÁ\r\u0097¡&4üÇ\u0095[Kî\u0018\u0081À\u0014\u0098¨(;êÎªLâß»jvõ<\u0001æ¬\u0087?yJ*Ö\u009aaR\u008c\u0012\u0018à«¸]¾Îá{5äP\u0010 ½æ.;[pÇÐp3\u009dQ\tººî'\u0012PuüÝº9)f\u009cº\u0003Î÷,ZcÉ®¼æ J\u0097\u008ezäî+]sÀ®·ú\u001bI\u008e\u0098\u009c²\u000fÊº\u0012%aÑ¹|êï \u009a~\u0006È±\u0016\\@È¤{öæ'\u0091a=õ¨\u0000[^Ç¸rî\u001d.\u0088z4Ì\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTBç\u001czÆ\rÐ¡&4ôÇª[\fî\n\u0081×\u0014\u0089¨/;ùÎ±bUõ\u0013\u0088\u009d\u001b½¯5BýÕ\u009eiNü\u001d\u008f×\"\u0089¶7IùÜ¿pk\u0003\u0001\u0096Ð)\u0096½\u0002Pïã¡ww\n\u0011\u009dÙ0\u008dÄ;\u0011\\\u0082$7ü¨\u0087\\]ñ1bÈ\u0017\u0096\u008b<<úÑ®EJö\b\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTBç\u001czÆ\rÐ¡&4ôÇª[\fî\n\u0081×\u0014\u0089¨/;ùÎ±bUõ\u0013\u0088\u009d\u001b½¯5BýÕ\u0096iDü(\u008fÑ\"\u008f¶-IûÜ¿pk\u0003\u0011§\f4t\u0081¬\u001e×ê\rGvÔ\u0092¡×=rD%×]b\u0085\u008fÓ\u001c«©s6\bÂÒ{iè\u0011]ÉÂ²6h\u009b\u0006\bñ}¹á\u0014VË»\u009d/g\u009c(\u0001øv¤\u0000A\u00939&á¹\u009aM@à!sß\u0006\u008c\u009a<-ôÀ´TFç\u001e\u0018É\u008b±>i¡\u0012UÈø·k[\u001e\u0006\u0082µ5|Ø!Lßÿ¨bT\u0015\u0005¹»,}ß?CÏö\u0091\u000f_\u009c')ÿ¶\u0084B^ï5|Ç\t\u0093\u0095;\"îÏ°\u0000A\u00939&á¹\u009aM@à9sÏ\u0006\u008f\u009a-\u0000A\u00939&á¹\u009aM@à?sÓ\u0006\u008e\u009a=-ôÀ©TW\u0000g\u0093,&æ¹\u009aMTà\u001dsý\u0006\u009a\u009a1NºÝñh;÷@\u0003\u009c®Ä=\bHJÔÓc-\u008ed\u001a\u008a©Þ4\u001aCZïÓz#\u0089w\u0015\u008b ×Ï\u0007ZCæþ\u0000g\u0093,&æ¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\tz÷\r\u0097¡#4ÙÇ½\u0006<\u0095w ½¿ÁK\u001bædu\u0088\u0000×\u009cc+¥ÆïR\u000báR|\u00ad\u000b×§y2ªÁö]\u0010èF\u0087\u008a\u0012ï®y\u0083\u0095\u0010Þ¥\u0014:hÎ²cÍð!\u0085~\u0019Ê®\fCF×¢dûù\u000e\u008ea\"Å·\u0010DNØ£mê\u0002/\u0097`+Ú¸(MXá¿e\u0087öÌC\u0006Üz( \u0085ß\u00163clÿØH\u001e¥T1°\u0082é\u001f\u0007h{ÄÉQ\u0014¢\\>°\u008bâä:qzÍë^\u000e«H\u0000g\u0093,&æ¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\tzç\r\u009b¡)4ôÇ¼[Pî\u0002\u0081Ú\u0014\u009a¨\u0004;úÎ¶bEõ\u0006\u0088Ö\u0000g\u0093,&æ¹\u009fMAà\u000bs×\u0006\u008a\u009a$-åÀ\u008cTJç\bzÐ\r\u0091¡\u00064ôÇª[pî\u000e\u0081Å\u0014\u0088¨#;üÎ¬bbõ\u001f\u0088À\u001b\u0088¯*BãÕ\u0087iAü\u001b\u008fÓ\"\u0096¶7\u0000g\u0093,&æ¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\tzô\r\u009a¡4\"ã±¨\u0004b\u009b\u001eoÄÂ»QW$\b¸¼\u000fzâ0vÔÅ\u008dXa/\b\u0083ª\u0016wå8yöÌ\u0080£Y6\u0017\u008a¶\u0000g\u0093,&æ¹\u009aM@à>sß\u0006\u0085\u009a--ÂÀ¶TLç\u0018zà\r«¡\u000e4Ô\u0000g\u0093,&æ¹\u009aM@à>sß\u0006\u0085\u009a--ÐÀ¾Twç\u0015zÅ\r\u009b\u0000g\u0093,&æ¹\u009aM@à>sß\u0006\u0085\u009a--ÁÀ¯TAç?zÐ\r\u008a¡34ùÇ·[Eî\u0018\u000fn\u009c=)Ô¶¸Bpï\u0003|Ë\t\u009d\u0095\u0006\"øÏ©[Aè\u0019uÁ\u0002\u008d®);ãÈ·TDá\u0000\u008eò\u001b\u009e\u0000c\u0093;&÷¹ºMPà\bsâ\u0006½\u009a\u000e-ôÀ®T@ç\u0004zó\r\u009f¡$4äÇ¶[Pî\u0012\u0081ù\u0014\u009c¨(;îÎ¿bDõ\u0018\u0088þ\u001b\u009d¯5\u0000c\u0093;&÷¹ºMPà\bsâ\u0006½\u009a\r-éÀ¿T@ç\u0019zÁ\r\u0091¡54ÃÇ¼[Pî\u001d\u0081Ý\u0014\u009e¨#\u0000g\u0093,&æ¹\u009aMTà\u001es÷\u0006\u009b\u009a\u001a-ôÀ«TVç\tzÆ\r\u008a\u008b®\u0018å\u00ad/2PÆ\u0084kÀø6\u008dX\u0011ç¦7\u0000g\u0093,&æ¹\u008bMVà\u0004sÕ\u0006\u009a\u009a\u0018-þÀ³TMç\u0018ÚFI\rüÇc©\u0097i:#©ãÜ\u008b@\u001c÷Ù\u001a\u009f,Y¿\u0012\nØ\u0095¤ajÌ _É*¥¶0\u0001Àì\u0096xpË3Vÿ\u001a=\u0089v<¼£ÀW\u001aú{i\u0083\u001cÄ\u0080v7®ÚòSäÀ¯ueê\u0019\u001eÃ³¸ \\U\u0019É¼".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1191);
        f5156 = cArr;
        f5158 = 7391298023995904841L;
    }

    public C2679bj(String str) {
        super(str);
    }

    /* renamed from: ﭖ */
    private static DTBFetchFactory m5512() {
        DTBFetchFactory dTBFetchFactory;
        int i = f5159 + 9;
        f5157 = i % 128;
        if (i % 2 == 0) {
            dTBFetchFactory = DTBFetchFactory.getInstance();
            int i2 = 43 / 0;
        } else {
            dTBFetchFactory = DTBFetchFactory.getInstance();
        }
        int i3 = f5159 + 83;
        f5157 = i3 % 128;
        if (i3 % 2 != 0) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* renamed from: ﭴ */
    private static String m5515() {
        int i = f5157 + 23;
        f5159 = i % 128;
        if (i % 2 == 0) {
            return AdRegistration.getAppKey();
        }
        int i2 = 2 / 0;
        return AdRegistration.getAppKey();
    }

    /* renamed from: ﭸ */
    private static ApsAdFormat m5517(ApsAd apsAd) {
        int i = f5159 + 63;
        f5157 = i % 128;
        if (i % 2 == 0) {
            apsAd.getApsAdFormat();
            throw null;
        }
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        f5157 = (f5159 + 73) % 128;
        return apsAdFormat;
    }

    /* renamed from: ﮉ */
    private static List<DTBAdSize> m5519(DTBAdResponse dTBAdResponse) {
        f5157 = (f5159 + 97) % 128;
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i = f5159 + 51;
        f5157 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
        return dTBAds;
    }

    /* renamed from: ﮌ */
    private static Bundle m5520(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 85;
        f5157 = i % 128;
        int i2 = i % 2;
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        if (i2 == 0) {
            int i3 = 99 / 0;
        }
        int i4 = f5157 + 29;
        f5159 = i4 % 128;
        if (i4 % 2 == 0) {
            return renderingBundle;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ DTBAdView m5521(ApsAd apsAd) {
        int i = f5159 + 41;
        f5157 = i % 128;
        if (i % 2 == 0) {
            m5514(apsAd);
            throw null;
        }
        DTBAdView dTBAdViewM5514 = m5514(apsAd);
        int i2 = f5157 + 51;
        f5159 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdViewM5514;
        }
        throw null;
    }

    /* renamed from: ﱟ */
    private static String m5525(DTBAdResponse dTBAdResponse) {
        f5159 = (f5157 + 45) % 128;
        String bidId = dTBAdResponse.getBidId();
        f5159 = (f5157 + 95) % 128;
        return bidId;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ String m5529() {
        int i = f5159 + 7;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return m5515();
        }
        int i2 = 2 / 0;
        return m5515();
    }

    /* renamed from: ﺙ */
    public static /* synthetic */ ApsAdRequest m5531(ApsAd apsAd) {
        f5159 = (f5157 + 95) % 128;
        ApsAdRequest apsAdRequestM5511 = m5511(apsAd);
        int i = f5159 + InterfaceC3173h3.d.b.f8819b;
        f5157 = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 0;
        }
        return apsAdRequestM5511;
    }

    /* renamed from: ﻏ */
    public static /* synthetic */ List m5535(DTBAdResponse dTBAdResponse) {
        f5157 = (f5159 + 71) % 128;
        List<DTBAdSize> listM5519 = m5519(dTBAdResponse);
        f5159 = (f5157 + 125) % 128;
        return listM5519;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ AdType m5536(DTBAdSize dTBAdSize) {
        f5157 = (f5159 + 107) % 128;
        AdType adTypeM5528 = m5528(dTBAdSize);
        int i = f5157 + 97;
        f5159 = i % 128;
        if (i % 2 == 0) {
            return adTypeM5528;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5540(ApsAd apsAd) {
        int i = f5157 + 25;
        f5159 = i % 128;
        int i2 = i % 2;
        String strM5534 = m5534(apsAd);
        if (i2 != 0) {
            int i3 = 71 / 0;
        }
        return strM5534;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ ApsAdFormat m5544(ApsAd apsAd) {
        int i = f5159 + 87;
        f5157 = i % 128;
        int i2 = i % 2;
        ApsAdFormat apsAdFormatM5517 = m5517(apsAd);
        if (i2 == 0) {
            int i3 = 14 / 0;
        }
        return apsAdFormatM5517;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Bundle m5548(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 9;
        f5157 = i % 128;
        int i2 = i % 2;
        Bundle bundleM5520 = m5520(dTBAdResponse);
        if (i2 == 0) {
            int i3 = 54 / 0;
        }
        f5159 = (f5157 + 89) % 128;
        return bundleM5520;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ ApsAdRequest m5552(ApsAd apsAd) {
        f5159 = (f5157 + 107) % 128;
        ApsAdRequest apsAdRequestM5527 = m5527(apsAd);
        int i = f5157 + 63;
        f5159 = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
        return apsAdRequestM5527;
    }

    /* renamed from: ﭖ */
    private static Map<String, String> m5513(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 23;
        f5157 = i % 128;
        if (i % 2 == 0) {
            dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
            throw null;
        }
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        f5159 = (f5157 + 47) % 128;
        return defaultVideoAdsRequestCustomParams;
    }

    /* renamed from: ﭴ */
    private static HashMap<String, Object> m5516(DTBAdResponse dTBAdResponse) {
        f5157 = (f5159 + 125) % 128;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        int i = f5157 + 39;
        f5159 = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
        return renderingMap;
    }

    /* renamed from: ﮉ */
    private static String m5518(ApsAd apsAd) {
        f5159 = (f5157 + 115) % 128;
        String slotUuid = apsAd.getSlotUuid();
        f5159 = (f5157 + 17) % 128;
        return slotUuid;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ DTBFetchFactory m5522() {
        int i = f5159 + InterfaceC3173h3.d.b.f8823f;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return m5512();
        }
        m5512();
        throw null;
    }

    /* renamed from: ﱟ */
    private static boolean m5526(DTBAdSize dTBAdSize) {
        int i = f5159 + 41;
        f5157 = i % 128;
        if (i % 2 == 0) {
            dTBAdSize.isInterstitialAd();
            throw null;
        }
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i2 = f5157 + 29;
        f5159 = i2 % 128;
        if (i2 % 2 == 0) {
            return zIsInterstitialAd;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private static String m5530(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 33;
        f5157 = i % 128;
        if (i % 2 == 0) {
            dTBAdResponse.getCrid();
            throw null;
        }
        String crid = dTBAdResponse.getCrid();
        f5157 = (f5159 + 11) % 128;
        return crid;
    }

    /* renamed from: ﺙ */
    private static String m5532(DTBAdResponse dTBAdResponse) {
        f5157 = (f5159 + 61) % 128;
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        f5159 = (f5157 + 121) % 128;
        return impressionUrl;
    }

    /* renamed from: ﻏ */
    private static String m5534(ApsAd apsAd) {
        f5157 = (f5159 + 35) % 128;
        String bidInfo = apsAd.getBidInfo();
        f5159 = (f5157 + 79) % 128;
        return bidInfo;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5538(ApsAd apsAd) {
        int i = f5157 + 63;
        f5159 = i % 128;
        if (i % 2 != 0) {
            m5518(apsAd);
            throw null;
        }
        String strM5518 = m5518(apsAd);
        f5159 = (f5157 + 51) % 128;
        return strM5518;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5541(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 23;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return m5525(dTBAdResponse);
        }
        m5525(dTBAdResponse);
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ HashMap m5546(DTBAdResponse dTBAdResponse) {
        f5159 = (f5157 + 73) % 128;
        HashMap<String, Object> mapM5516 = m5516(dTBAdResponse);
        int i = f5159 + 25;
        f5157 = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
        return mapM5516;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5550(ApsAd apsAd) {
        f5159 = (f5157 + 55) % 128;
        String strM5524 = m5524(apsAd);
        int i = f5157 + 7;
        f5159 = i % 128;
        if (i % 2 == 0) {
            return strM5524;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ a m5553(C2679bj c2679bj, HashMap map, InterfaceC2704ch interfaceC2704ch) {
        int i = f5159 + 13;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return c2679bj.m5537((HashMap<String, DTBFetchManager>) map, interfaceC2704ch);
        }
        c2679bj.m5537((HashMap<String, DTBFetchManager>) map, interfaceC2704ch);
        throw null;
    }

    /* renamed from: ﭖ */
    private static ApsAdRequest m5511(ApsAd apsAd) {
        int i = f5157 + 37;
        f5159 = i % 128;
        int i2 = i % 2;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        if (i2 != 0) {
            int i3 = 91 / 0;
        }
        return adLoader;
    }

    /* renamed from: ﭴ */
    private static DTBAdView m5514(ApsAd apsAd) {
        f5159 = (f5157 + 53) % 128;
        DTBAdView adView = apsAd.getAdView();
        f5159 = (f5157 + 35) % 128;
        return adView;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ Map m5523(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 97;
        f5157 = i % 128;
        int i2 = i % 2;
        Map<String, String> mapM5513 = m5513(dTBAdResponse);
        if (i2 == 0) {
            int i3 = 54 / 0;
        }
        int i4 = f5157 + 69;
        f5159 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapM5513;
        }
        throw null;
    }

    /* renamed from: ﱟ */
    private static String m5524(ApsAd apsAd) {
        int i = f5159 + 73;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return apsAd.getPricePoint();
        }
        apsAd.getPricePoint();
        throw null;
    }

    /* renamed from: ﱡ */
    private static AdType m5528(DTBAdSize dTBAdSize) {
        f5157 = (f5159 + 37) % 128;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i = f5157 + 7;
        f5159 = i % 128;
        if (i % 2 == 0) {
            return dTBAdType;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    private static JSONObject m5533(DTBAdSize dTBAdSize) {
        f5159 = (f5157 + 11) % 128;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        f5157 = (f5159 + 29) % 128;
        return pubSettings;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5539(DTBAdResponse dTBAdResponse) {
        int i = f5159 + 3;
        f5157 = i % 128;
        if (i % 2 == 0) {
            m5530(dTBAdResponse);
            throw null;
        }
        String strM5530 = m5530(dTBAdResponse);
        f5159 = (f5157 + 9) % 128;
        return strM5530;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5542(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f5159 = (f5157 + 19) % 128;
        String strM5545 = m5545(dTBAdResponse, dTBAdSize);
        f5159 = (f5157 + InterfaceC3173h3.d.b.f8821d) % 128;
        return strM5545;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m5547(DTBAdSize dTBAdSize) {
        int i = f5157 + 37;
        f5159 = i % 128;
        if (i % 2 != 0) {
            m5526(dTBAdSize);
            throw null;
        }
        boolean zM5526 = m5526(dTBAdSize);
        f5159 = (f5157 + 69) % 128;
        return zM5526;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5551(DTBAdSize dTBAdSize) {
        int i = f5159 + 107;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return m5557(dTBAdSize);
        }
        m5557(dTBAdSize);
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ d m5554(C2679bj c2679bj, ThreadPoolExecutor threadPoolExecutor, InterfaceC2704ch interfaceC2704ch) {
        f5159 = (f5157 + 91) % 128;
        d dVarM5555 = c2679bj.m5555(threadPoolExecutor, interfaceC2704ch);
        int i = f5157 + 107;
        f5159 = i % 128;
        if (i % 2 == 0) {
            return dVarM5555;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private static ApsAdRequest m5527(ApsAd apsAd) {
        int i = f5157 + 67;
        f5159 = i % 128;
        int i2 = i % 2;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        if (i2 != 0) {
            int i3 = 24 / 0;
        }
        return apsAdRequest;
    }

    /* renamed from: ﻐ */
    private a m5537(HashMap<String, DTBFetchManager> map, InterfaceC2704ch interfaceC2704ch) {
        a aVar = new a(map, interfaceC2704ch);
        f5159 = (f5157 + 113) % 128;
        return aVar;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ JSONObject m5543(DTBAdSize dTBAdSize) {
        int i = f5159 + 99;
        f5157 = i % 128;
        int i2 = i % 2;
        JSONObject jSONObjectM5533 = m5533(dTBAdSize);
        if (i2 == 0) {
            int i3 = 96 / 0;
        }
        return jSONObjectM5533;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5556(DTBAdResponse dTBAdResponse) {
        int i = f5157 + InterfaceC3173h3.d.b.f8819b;
        f5159 = i % 128;
        int i2 = i % 2;
        String strM5532 = m5532(dTBAdResponse);
        if (i2 != 0) {
            int i3 = 96 / 0;
        }
        f5157 = (f5159 + 59) % 128;
        return strM5532;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06b0  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 2066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2679bj.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾇ */
    public final String mo5467() {
        int i = f5159 + 89;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return AdRegistration.getVersion();
        }
        AdRegistration.getVersion();
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5549(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5156[i2 + i3] ^ (i3 * f5158)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5549((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, 753 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5529();
            }
        });
        map.put(m5549(23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 762 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (20189 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5522();
            }
        });
        map.put(m5549(18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 785, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.19
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5541((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(TextUtils.indexOf((CharSequence) "", '0', 0) + 24, 802 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.getTrimmedLength("") + 1627)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.18
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5539((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(TextUtils.getTrimmedLength("") + 26, Color.argb(0, 0, 0, 0) + 826, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33778)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.17
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5556((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(25 - (Process.myTid() >> 22), 852 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 26080)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.20
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5546((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(28 - Color.red(0), 877 - TextUtils.getCapsMode("", 0, 0), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.21
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5548((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 905, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.22
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5523((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 941 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.24
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5535((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5549(23 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 959, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 8837)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5542((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m5549(((Process.getThreadPriority(0) + 20) >> 6) + 17, 981 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5551((DTBAdSize) list.get(0));
            }
        });
        map.put(m5549((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (ViewConfiguration.getPressedStateDuration() >> 16) + DescriptorProtos.Edition.EDITION_PROTO2_VALUE, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5536((DTBAdSize) list.get(0));
            }
        });
        map.put(m5549(Color.blue(0) + 20, 1013 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5543((DTBAdSize) list.get(0));
            }
        });
        map.put(m5549(21 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3847)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2679bj.m5547((DTBAdSize) list.get(0)));
            }
        });
        map.put(m5549(29 - ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 1055, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5553(C2679bj.this, (HashMap) list.get(0), interfaceC2704ch);
            }
        });
        map.put(m5549(23 - (Process.myPid() >> 22), TextUtils.getOffsetAfter("", 0) + 1085, (char) (AndroidCharacter.getMirror('0') - '0')).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5554(C2679bj.this, (ThreadPoolExecutor) list.get(0), interfaceC2704ch);
            }
        });
        map.put(m5549(KeyEvent.normalizeMetaState(0) + 15, View.combineMeasuredStates(0, 0) + 1108, (char) Color.argb(0, 0, 0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5552((ApsAd) list.get(0));
            }
        });
        map.put(m5549(9 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTapTimeout() >> 16) + 1123, (char) (35785 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5540((ApsAd) list.get(0));
            }
        });
        map.put(m5549(TextUtils.getOffsetAfter("", 0) + 13, 1132 - Process.getGidForName(""), (char) View.resolveSizeAndState(0, 0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.12
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5550((ApsAd) list.get(0));
            }
        });
        map.put(m5549(TextUtils.indexOf((CharSequence) "", '0', 0) + 12, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1146, (char) (View.resolveSize(0, 0) + 55841)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5538((ApsAd) list.get(0));
            }
        });
        map.put(m5549(TextUtils.getTrimmedLength("") + 14, (ViewConfiguration.getScrollBarSize() >> 8) + 1157, (char) (11325 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5544((ApsAd) list.get(0));
            }
        });
        map.put(m5549(11 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1170, (char) (View.combineMeasuredStates(0, 0) + 6746)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5531((ApsAd) list.get(0));
            }
        });
        map.put(m5549((ViewConfiguration.getJumpTapTimeout() >> 16) + 9, Color.blue(0) + 1182, (char) (21379 - KeyEvent.getDeadChar(0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.16
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2679bj.m5521((ApsAd) list.get(0));
            }
        });
        int i = f5157 + 109;
        f5159 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        Matcher matcher = Pattern.compile(m5549(13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.alpha(0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 19295)).intern()).matcher(mo5467());
        if (matcher.matches()) {
            int i = f5159 + 85;
            f5157 = i % 128;
            return i % 2 == 0 ? matcher.group(1) : matcher.group(1);
        }
        int i2 = f5157 + 3;
        f5159 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static String m5557(DTBAdSize dTBAdSize) {
        f5157 = (f5159 + 45) % 128;
        String slotUUID = dTBAdSize.getSlotUUID();
        int i = f5159 + InterfaceC3173h3.d.b.f8821d;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return slotUUID;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private d m5555(ThreadPoolExecutor threadPoolExecutor, InterfaceC2704ch interfaceC2704ch) {
        d dVar = new d(threadPoolExecutor, interfaceC2704ch);
        int i = f5159 + 5;
        f5157 = i % 128;
        if (i % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m5545(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f5157 = (f5159 + 125) % 128;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        f5159 = (f5157 + 35) % 128;
        return pricePoints;
    }
}
