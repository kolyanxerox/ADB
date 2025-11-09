package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.OooOO0O;
import o00O0.OooO;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class Options extends OooO implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private final void buildTrieRecursive(long j, Buffer buffer, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) throws IOException {
            int i4;
            int i5;
            int i6;
            long j2;
            int i7 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (list.get(i8).size() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            if (i7 == byteString.size()) {
                int iIntValue = list2.get(i2).intValue();
                int i9 = i2 + 1;
                ByteString byteString3 = list.get(i9);
                i4 = i9;
                i5 = iIntValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.getByte(i7) == byteString2.getByte(i7)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && byteString.getByte(i11) == byteString2.getByte(i11); i11++) {
                    i10++;
                }
                long intCount = j + getIntCount(buffer) + 2 + i10 + 1;
                buffer.writeInt(-i10);
                buffer.writeInt(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    buffer.writeInt(byteString.getByte(i7) & ForkServer.ERROR);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != list.get(i4).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.writeInt(list2.get(i4).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i12, list, i4, i3, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (list.get(i14 - 1).getByte(i7) != list.get(i14).getByte(i7)) {
                    i13++;
                }
            }
            long intCount2 = j + getIntCount(buffer) + 2 + (i13 * 2);
            buffer.writeInt(i13);
            buffer.writeInt(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                byte b = list.get(i15).getByte(i7);
                if (i15 == i4 || b != list.get(i15 - 1).getByte(i7)) {
                    buffer.writeInt(b & ForkServer.ERROR);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i4 < i3) {
                byte b2 = list.get(i4).getByte(i7);
                int i16 = i4 + 1;
                int i17 = i16;
                while (true) {
                    if (i17 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (b2 != list.get(i17).getByte(i7)) {
                            i6 = i17;
                            break;
                        }
                        i17++;
                    }
                }
                if (i16 == i6 && i7 + 1 == list.get(i4).size()) {
                    buffer.writeInt(list2.get(i4).intValue());
                    j2 = intCount2;
                } else {
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                    j2 = intCount2;
                    buildTrieRecursive(j2, buffer3, i7 + 1, list, i4, i6, list2);
                }
                intCount2 = j2;
                i4 = i6;
            }
            buffer.writeAll(buffer3);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
            if ((i4 & 1) != 0) {
                j = 0;
            }
            companion.buildTrieRecursive(j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
        
            continue;
         */
        /* renamed from: of */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okio.Options m3967of(com.applovin.shadow.okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Options.Companion.m3967of(com.applovin.shadow.okio.ByteString[]):com.applovin.shadow.okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, OooOO0O oooOO0O) {
        this(byteStringArr, iArr);
    }

    /* renamed from: of */
    public static final Options m3966of(ByteString... byteStringArr) {
        return Companion.m3967of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // o00O0.OooO00o
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // o00O0.OooO00o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public ByteString get(int i) {
        return this.byteStrings[i];
    }

    @Override // o00O0.OooO, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // o00O0.OooO, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
