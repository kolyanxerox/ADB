package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import o00O0.OooOOO0;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOO;
import o00O0Oo.o00O0O;
import o00O0o.o000oOoO;
import oo00o.OooOo;

@OooO(m13471c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m13472f = "FileSystem.kt", m13473l = {75}, m13474m = "invokeSuspend")
/* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 */
/* loaded from: classes2.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends OooOOO implements o00O0O {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, oooO0OO);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o000oOoO o000oooo2 = (o000oOoO) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            OooOOO0 oooOOO0 = new OooOOO0();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(o000oooo2, fileSystem, oooOOO0, path, false, true, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000oOoO o000oooo2, OooO0OO oooO0OO) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(o000oooo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
