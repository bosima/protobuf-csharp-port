This repo was originally exported from http://code.google.com/p/protobuf-csharp-port,
and represents the latest "legacy" version of protobuf-csharp-port.

This project has now been folded into the [main Google Protocol Buffers project](http://github.com/google/protobuf),
and is being revamped to support proto3. It is not expected to be fully backwardly-compatible with
the code in this repo - in particular, some of the C#-specific options may not be supported in the new
codebase, and some of the generated code may differ. A new major version offers an opportunity to spring-clean,
as it were.

This repo exists as an acknowledgement that not everyone will want to immediately use the newer codebase,
and that they may wish to make changes to the legacy codebase. I do not expect to make any changes within this
repo, but it can be forked for further changes.

因为用了Google.ProtocolBuffers 2.4.1.555，新的Google.ProtoBuf和老版本的SDK差别较大，这个版本不支持.net core，又不想改业务代码，所以只好找到这个源代码修改下。

只是增加了项目文件和解决访问文件。
ProtocolBuffersLibrary.NETSTANDARD.sln
ProtocolBuffers.NETSTANDARD.csproj
ProtocolBuffers.Serialization.NETSTANDARD.csproj
