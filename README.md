# MaparaChat

MaparaChat é uma aplicação de mensagens em tempo real com suporte a texto, mídias e chamadas, disponível na Web e no Android (WebView).

## Configuração (sem expor chaves)

Este repositório não inclui chaves reais. Para rodar o projeto sem expor credenciais:

- Web (Firebase):
  - Copie `public/config.example.js` para `public/config.js` e preencha com o Firebase Web do seu projeto.
  - O arquivo `public/config.js` **não deve ser commitado** (está no `.gitignore`).
- Android (Firebase):
  - Baixe o `google-services.json` do seu projeto Firebase e coloque em `android/app/google-services.json`.
  - O arquivo `android/app/google-services.json` **não deve ser commitado** (está no `.gitignore`).
  - Use `android/app/google-services.example.json` como referência de estrutura.
- Backend (Supabase Edge Function):
  - Configure os secrets no Supabase (Dashboard → Edge Functions → Secrets): `SUPABASE_URL`, `SUPABASE_SERVICE_ROLE_KEY`,
    `MAPARACHAT_STORAGE_BUCKET`, `MAPARACHAT_STORAGE_PUBLIC_BASE_URL` (opcional),
    `FIREBASE_SERVICE_ACCOUNT_JSON_BASE64` (ou `FIREBASE_SERVICE_ACCOUNT_JSON`).
  - Guia: `SUPABASE_EDGE_FREE_SETUP.md`.

Observação: o `apiKey` do Firebase Web não é um segredo (ele aparece no navegador), mas deve estar **restrito** no Google Cloud
(restrições de APIs e de referers/domínios) e protegido por regras do Firebase.

## Funcionalidades

- Cadastro e login com e-mail/senha e Google.
- Perfil com foto, corte/zoom e identificação `@`.
- Lista de amigos com busca, bloqueio e silenciamento.
- Contato próprio para anotações pessoais (aparece como "Nome (Você)").
- Mensagens de texto com edição, cópia, resposta e exclusão.
- Seleção múltipla de mensagens para excluir ou compartilhar.
- Compartilhamento de mensagens e arquivos para vários amigos.
- Envio e recebimento de imagens, vídeos, áudios e documentos.
- Gravação de áudio e vídeo diretamente no chat.
- Controle de flash da câmera (quando suportado).
- Pré-visualização de mídias com gestos e navegação entre itens.
- Chamadas de voz e vídeo com controles e alternância de câmera.
- Indicadores de digitação/gravação de áudio.
- Status online e visto por último (com opção de ocultar).
- Notificações de mensagens e chamadas no Android.
- Salvamento de mídia automático ou manual.
- Pastas locais no PC: `MaparaChat/Media` com estrutura organizada.
- Personalização do chat: tema, fonte, idioma e plano de fundo.
- Toques personalizados para mensagens e chamadas (MP3).

## Plataformas

- Web (navegador).
- Android (APK com WebView, compartilhamento nativo e notificações).

## Sobre o desenvolvedor

**Luiz Sérgio Garcia Carvalho**  
Formado em Sistemas de Informação e Licenciatura em Matemática.  
Contato: (91) 993064354 (WhatsApp)  
E-mail: luizynho27@gmail.com
