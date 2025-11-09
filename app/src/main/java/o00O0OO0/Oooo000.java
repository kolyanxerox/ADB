package o00O0Oo0;

import java.io.File;

/* loaded from: classes3.dex */
public final class Oooo000 extends OooOo {

    /* renamed from: OooO0O0 */
    public boolean f31381OooO0O0;

    /* renamed from: OooO0OO */
    public File[] f31382OooO0OO;

    /* renamed from: OooO0Oo */
    public int f31383OooO0Oo;

    /* renamed from: OooO0o */
    public final /* synthetic */ o0OoOo0 f31384OooO0o;

    /* renamed from: OooO0o0 */
    public boolean f31385OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(o0OoOo0 o0oooo0, File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.OooOo.OooO0o0(rootDir, "rootDir");
        this.f31384OooO0o = o0oooo0;
    }

    @Override // o00O0Oo0.o00O0O
    public final File OooO00o() {
        boolean z = this.f31385OooO0o0;
        File file = this.f31390OooO00o;
        o0OoOo0 o0oooo0 = this.f31384OooO0o;
        if (!z && this.f31382OooO0OO == null) {
            ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f31382OooO0OO = fileArrListFiles;
            if (fileArrListFiles == null) {
                ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
                this.f31385OooO0o0 = true;
            }
        }
        File[] fileArr = this.f31382OooO0OO;
        if (fileArr != null && this.f31383OooO0Oo < fileArr.length) {
            kotlin.jvm.internal.OooOo.OooO0O0(fileArr);
            int i = this.f31383OooO0Oo;
            this.f31383OooO0Oo = i + 1;
            return fileArr[i];
        }
        if (this.f31381OooO0O0) {
            ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
            return null;
        }
        this.f31381OooO0O0 = true;
        return file;
    }
}
