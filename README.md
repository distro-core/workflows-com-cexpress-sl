# DISTRO Core GitHub Workflows

This repository supplies workflows used by GitHub Actions; the
specific configuration for a single MACHINE is referenced. The
variable for MACHINE is set in the repo vars context.

### GitHub Actions

[![Scheduled Update Mirrors](https://github.com/distro-core/distro-manifest/actions/workflows/scheduled-update-mirrors.yml/badge.svg)](https://github.com/distro-core/distro-manifest/actions/workflows/scheduled-update-mirrors.yml)

### [Actions com-cexpress-sl](https://github.com/distro-core/workflows-com-cexpress-sl/actions)

[![GitHub Hosted Build](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/github-hosted-build.yml/badge.svg)](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/github-hosted-build.yml)
[![GitHub Hosted Fetch](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/github-hosted-fetch.yml/badge.svg)](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/github-hosted-fetch.yml)
[![Self Hosted Build](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/self-hosted-build.yml/badge.svg)](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/self-hosted-build.yml)
[![Self Hosted Fetch](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/self-hosted-fetch.yml/badge.svg)](https://github.com/distro-core/workflows-com-cexpress-sl/actions/workflows/self-hosted-fetch.yml)

## LICENSE Information

Copyright (c) 2025 brainhoard.com

For all original content supplied with this layer, unless otherwise
specified, is licensed as [LICENSE](./LICENSE).

Editorial discretion is asserted on specific inclusion of layers that
may referenced. All upstream packages and their source code come with
their respective licenses. Individual packages license terms are to be
respected.

## CI/CD GitHub Actions

The path .github/workflows/ contains reusable GitHub Actions reusable
workflows that facilitate per MACHINE repositories to build and manage
artifacts from the common source scripting.
