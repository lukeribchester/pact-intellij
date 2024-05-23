# Pact Language Support for the IntelliJ Platform 🚀

<p align="center">
    <picture>
        <source srcset="./images/kadena-logotype-light.svg" media="(prefers-color-scheme: dark)"/>
        <img src="./images/kadena-logotype-dark.svg" width="830" alt="Kadena logo" />
    </picture>
</p>

![Build](https://github.com/lukeribchester/pact-intellij/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/23581.svg)](https://plugins.jetbrains.com/plugin/23581)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/23581.svg)](https://plugins.jetbrains.com/plugin/23581)

<!-- Plugin description -->
This plugin provides support for [Kadena's](https://kadena.io/) Pact smart contract language to the IntelliJ Platform.

_**Warning:** While effort is made to ensure a stable and reliable user experience, this plugin is under heavy 
development and includes features based on the experimental IntelliJ Platform Language Server API._

## What is Kadena?
Kadena is the industry’s only truly scalable Layer-1 Proof-of-Work blockchain. More to the point, it’s the only 
blockchain scalable enough to fully replace the global financial system — and other legacy centralized systems — 
without compromising on speed or security.

With Chainweb, Kadena’s multi-braided, infinitely scalable blockchain technology, and Pact, our industry-leading smart 
contract language, Kadena transcends the limits of conventional Layer-1 and Layer-2 blockchains, enabling builders to 
create meaningful solutions to real-world problems.

In other words, Kadena is operating on a whole other layer: Layer H, the Human Layer.

### What is Pact? 🤝
Pact is a human-readable smart contract language. It allows anyone to write clearly, directly and safely onto a 
blockchain — a true innovation for secure and simple smart contract development. Pact will enable you to create 
entirely new business models and on-chain services.

- [**Get started with Pact**](https://docs.kadena.io/pact)

### What is a smart contract? 📑

Smart contracts are like regular, paper contracts, except that their terms are enforced by computer code, instead of 
humans. Imagine if a baseball player received an automatic bonus in his next paycheck because he hit a certain number 
of home runs.

Smart contracts are the next generation of legal contracts. And Pact is the next generation of smart contracts.

## Features

### Pact Language Server (LSP)

- Error highlighting
- Code completion
- Documentation

Please refer to the [documentation](https://github.com/kadena-io/pact-lsp/tree/main#supported-features) for a full list
of supported features.

_**Note:** Support for Language Server Protocol features on the IntelliJ Platform is currently experimental._

### Native (IntelliJ Platform)

- In progress

## Roadmap

1. Support for the [Pact Language Server (LSP)](https://github.com/kadena-io/pact-lsp/tree/main#supported-features)
2. Pact support via the
   [IntelliJ Platform Language API](https://plugins.jetbrains.com/docs/intellij/custom-language-support.html)
<!-- Plugin description end -->

---

## Requirements

### 1. Pact

Install [Pact](https://github.com/kadena-io/pact) by downloading a 
[prebuilt binary](https://github.com/kadena-io/pact#binary-downloads) or by 
[building from source](https://github.com/kadena-io/pact#building-from-source).

#### macOS

The easiest way to install Pact on macOS is by using the [Homebrew](https://brew.sh) package manager. With Homebrew 
installed, run the following commands:

```bash
brew update
brew install kadena-io/pact/pact
```

### 2. Pact Language Server (LSP)

The latest [Pact Language Server](https://github.com/kadena-io/pact-lsp) releases for macOS, Linux, and Windows are included with this plugin. 

Alternatively you can install a different version by downloading a 
[prebuilt binary](https://github.com/kadena-io/pact-lsp/releases/latest) or by 
[building from source](https://github.com/kadena-io/pact-lsp#building-from-source).

## Installation

### JetBrains Marketplace

Install using your IDE's built-in plugin marketplace:

1. Navigate to <kbd>Settings/Preferences</kbd>
2. Select <kbd>Plugins</kbd> > <kbd>Marketplace</kbd>
3. Search for <kbd>'Pact'</kbd>
4. Select <kbd>Install Plugin</kbd>

View on the [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/23581-pact).

### Manual

Download the [latest release](https://github.com/lukeribchester/pact-intellij/releases/latest) and install it manually
from disk through your IDE:

1. Navigate to <kbd>Settings/Preferences</kbd>
2. Select <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install Plugin from Disk...</kbd>
3. Open the downloaded `.zip` file

## Configuration

Configuration is required to enable functionality from the Pact Language Server:

1. Navigate to <kbd>Settings/Preferences</kbd>
2. Select <kbd>Languages & Frameworks</kbd> > <kbd>Pact</kbd>
3. Specify your <kbd>Pact Compiler</kbd> and <kbd>Pact Language Server</kbd> paths

#### Homebrew

If you installed Pact via Homebrew then run the following command to retrieve the path of the executable:

```bash
brew info pact
```
